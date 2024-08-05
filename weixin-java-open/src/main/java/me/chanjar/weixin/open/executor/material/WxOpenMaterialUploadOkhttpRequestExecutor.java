package me.chanjar.weixin.open.executor.material;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

import me.chanjar.weixin.open.bean.icp.WxOpenUploadIcpMedia;
import me.chanjar.weixin.open.bean.icp.WxOpenUploadIcpMediaResult;

import me.chanjar.weixin.common.enums.WxType;
import me.chanjar.weixin.common.error.WxError;
import me.chanjar.weixin.common.error.WxErrorException;
import me.chanjar.weixin.common.util.http.RequestHttp;
import me.chanjar.weixin.common.util.http.okhttp.OkHttpProxyInfo;
import me.chanjar.weixin.common.util.json.WxGsonBuilder;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class WxOpenMaterialUploadOkhttpRequestExecutor extends WxOpenMaterialUploadRequestExecutor<OkHttpClient, OkHttpProxyInfo> {

	@SuppressWarnings({ "rawtypes" })
	public WxOpenMaterialUploadOkhttpRequestExecutor(RequestHttp requestHttp) {
		super(requestHttp);
	}

	@SuppressWarnings("deprecation")
	@Override
	public WxOpenUploadIcpMediaResult execute(String uri, WxOpenUploadIcpMedia material, WxType wxType) throws WxErrorException, IOException {
		// logger.debug("MaterialUploadOkhttpRequestExecutor is running");
		if (material == null) {
			throw new WxErrorException("闈炴硶璇锋眰锛宮aterial鍙傛暟涓虹┖");
		}
		File file = material.getMedia();
		if (file == null || !file.exists()) {
			throw new FileNotFoundException();
		}

		OkHttpClient client = requestHttp.getRequestHttpClient();

		MultipartBody.Builder bodyBuilder = new MultipartBody.Builder().setType(MediaType.parse("multipart/form-data")).addFormDataPart("media", file.getName(), RequestBody.create(MediaType.parse("application/octet-stream"), file));
		Map<String, String> form = material.getForm();
		if (form != null) {
			bodyBuilder.addFormDataPart("description", WxGsonBuilder.create().toJson(form));
			for (String key : form.keySet()) {
				bodyBuilder.addFormDataPart(key, form.get(key));
			}
		}
		Request request = new Request.Builder().url(uri).post(bodyBuilder.build()).build();
		Response response = client.newCall(request).execute();
		String responseContent = response.body().string();
		WxError error = WxError.fromJson(responseContent, WxType.MP);
		if (error.getErrorCode() != 0) {
			throw new WxErrorException(error);
		} else {
			return WxOpenUploadIcpMediaResult.fromJson(responseContent);
		}
	}

}
