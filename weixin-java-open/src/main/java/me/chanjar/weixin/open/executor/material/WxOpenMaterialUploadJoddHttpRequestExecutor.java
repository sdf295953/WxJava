package me.chanjar.weixin.open.executor.material;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Map;

import org.apache.http.Consts;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.content.StringBody;

import me.chanjar.weixin.open.bean.icp.WxOpenUploadIcpMedia;
import me.chanjar.weixin.open.bean.icp.WxOpenUploadIcpMediaResult;

import jodd.http.HttpConnectionProvider;
import jodd.http.HttpRequest;
import jodd.http.HttpResponse;
import jodd.http.ProxyInfo;
import me.chanjar.weixin.common.enums.WxType;
import me.chanjar.weixin.common.error.WxError;
import me.chanjar.weixin.common.error.WxErrorException;
import me.chanjar.weixin.common.util.http.RequestHttp;
import me.chanjar.weixin.common.util.json.WxGsonBuilder;

public class WxOpenMaterialUploadJoddHttpRequestExecutor extends WxOpenMaterialUploadRequestExecutor<HttpConnectionProvider, ProxyInfo> {

	@SuppressWarnings({ "rawtypes" })
	public WxOpenMaterialUploadJoddHttpRequestExecutor(RequestHttp requestHttp) {
		super(requestHttp);
	}

	@Override
	public WxOpenUploadIcpMediaResult execute(String uri, WxOpenUploadIcpMedia material, WxType wxType) throws WxErrorException, IOException {
		HttpRequest request = HttpRequest.post(uri);
		if (requestHttp.getRequestHttpProxy() != null) {
			requestHttp.getRequestHttpClient().useProxy(requestHttp.getRequestHttpProxy());
		}
		request.withConnectionProvider(requestHttp.getRequestHttpClient());

		if (material == null) {
			throw new WxErrorException("闈炴硶璇锋眰锛宮aterial鍙傛暟涓虹┖");
		}

		File file = material.getMedia();
		if (file == null || !file.exists()) {
			throw new FileNotFoundException();
		}
		request.form("media", file);
		Map<String, String> form = material.getForm();
		if (material.getForm() != null) {
			request.form("description", WxGsonBuilder.create().toJson(form));
			for (String key : form.keySet()) {
				request.form(key, new StringBody(form.get(key), ContentType.create("multipart/form-data", Consts.UTF_8)));
			}
		}

		HttpResponse response = request.send();
		response.charset(StandardCharsets.UTF_8.name());
		String responseContent = response.bodyText();
		WxError error = WxError.fromJson(responseContent, WxType.MP);
		if (error.getErrorCode() != 0) {
			throw new WxErrorException(error);
		} else {
			return WxOpenUploadIcpMediaResult.fromJson(responseContent);
		}
	}

}
