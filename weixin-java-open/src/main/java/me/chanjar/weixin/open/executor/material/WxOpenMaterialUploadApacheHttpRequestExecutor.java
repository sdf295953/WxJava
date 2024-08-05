package me.chanjar.weixin.open.executor.material;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

import org.apache.http.Consts;
import org.apache.http.HttpHost;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.CloseableHttpClient;

import me.chanjar.weixin.open.bean.icp.WxOpenUploadIcpMedia;
import me.chanjar.weixin.open.bean.icp.WxOpenUploadIcpMediaResult;

import me.chanjar.weixin.common.enums.WxType;
import me.chanjar.weixin.common.error.WxError;
import me.chanjar.weixin.common.error.WxErrorException;
import me.chanjar.weixin.common.util.http.RequestHttp;
import me.chanjar.weixin.common.util.http.apache.Utf8ResponseHandler;

public class WxOpenMaterialUploadApacheHttpRequestExecutor extends WxOpenMaterialUploadRequestExecutor<CloseableHttpClient, HttpHost> {
	@SuppressWarnings({ "rawtypes" })
	public WxOpenMaterialUploadApacheHttpRequestExecutor(RequestHttp requestHttp) {
		super(requestHttp);
	}

	@Override
	public WxOpenUploadIcpMediaResult execute(String uri, WxOpenUploadIcpMedia material, WxType wxType) throws WxErrorException, IOException {
		HttpPost httpPost = new HttpPost(uri);
		if (requestHttp.getRequestHttpProxy() != null) {
			RequestConfig response = RequestConfig.custom().setProxy(requestHttp.getRequestHttpProxy()).build();
			httpPost.setConfig(response);
		}

		if (material == null) {
			throw new WxErrorException("闈炴硶璇锋眰锛宮aterial鍙傛暟涓虹┖");
		}

		File file = material.getMedia();
		if (file == null || !file.exists()) {
			throw new FileNotFoundException();
		}

		MultipartEntityBuilder multipartEntityBuilder = MultipartEntityBuilder.create();
		multipartEntityBuilder.addBinaryBody("media", file).setMode(HttpMultipartMode.RFC6532);
		Map<String, String> form = material.getForm();



		if (material.getForm() != null) {
			for (String key : form.keySet()) {
				multipartEntityBuilder.addPart(key, new StringBody(form.get(key), ContentType.create("multipart/form-data", Consts.UTF_8)));
			}
		}

		httpPost.setEntity(multipartEntityBuilder.build());
		// 鎵嬪姩璁剧疆鐨凜ontent-Type璇锋眰澶存病鏈塨oundary锛屾槸涓�涓潪鏍囧噯鐨勬枃浠朵笂浼犺姹傚ご锛岃櫧鐒跺井淇℃彁渚涗簡瀵硅繖绫婚潪鏍囧噯璇锋眰鐨勬敮鎸侊紝浣嗗鏋滆姹傞渶瑕佸厛缁忚繃鎴戜滑鐨則omcat
		// server锛岄偅涔堥兘浼氭姤閿�:the request was rejected because no multipart boundary was
		// found
		// 涓嶈缃瓹ontent-Type璇锋眰澶达紝httpclient灏嗕細鑷姩璁剧疆锛屽�间负entity鐨刧etContentType鏂规硶杩斿洖鍊笺�侻ultipartEntityBuilder鐨刧etContentType鏂规硶灏嗕細杩斿洖boundary
		// httpPost.setHeader("Content-Type",
		// ContentType.MULTIPART_FORM_DATA.toString());

		try (CloseableHttpResponse response = requestHttp.getRequestHttpClient().execute(httpPost)) {
			String responseContent = Utf8ResponseHandler.INSTANCE.handleResponse(response);
			WxError error = WxError.fromJson(responseContent, WxType.MP);
			if (error.getErrorCode() != 0) {
				throw new WxErrorException(error);
			} else {
				return WxOpenUploadIcpMediaResult.fromJson(responseContent);
			}
		} finally {
			httpPost.releaseConnection();
		}
	}

}
