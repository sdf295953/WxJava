package me.chanjar.weixin.open.executor.material;

import java.io.IOException;

import me.chanjar.weixin.open.bean.icp.WxOpenUploadIcpMedia;
import me.chanjar.weixin.open.bean.icp.WxOpenUploadIcpMediaResult;

import me.chanjar.weixin.common.enums.WxType;
import me.chanjar.weixin.common.error.WxErrorException;
import me.chanjar.weixin.common.util.http.RequestExecutor;
import me.chanjar.weixin.common.util.http.RequestHttp;
import me.chanjar.weixin.common.util.http.ResponseHandler;

public abstract class WxOpenMaterialUploadRequestExecutor<H, P> implements RequestExecutor<WxOpenUploadIcpMediaResult, WxOpenUploadIcpMedia> {
	protected RequestHttp<H, P> requestHttp;

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public WxOpenMaterialUploadRequestExecutor(RequestHttp requestHttp) {
		this.requestHttp = requestHttp;
	}

	@Override
	public void execute(String uri, WxOpenUploadIcpMedia data, ResponseHandler<WxOpenUploadIcpMediaResult> handler, WxType wxType) throws WxErrorException, IOException {
		handler.handle(this.execute(uri, data, wxType));
	}

	@SuppressWarnings("rawtypes")
	public static RequestExecutor<WxOpenUploadIcpMediaResult, WxOpenUploadIcpMedia> create(RequestHttp requestHttp) {
		switch (requestHttp.getRequestType()) {
		case APACHE_HTTP:
			return new WxOpenMaterialUploadApacheHttpRequestExecutor(requestHttp);
		case JODD_HTTP:
			return new WxOpenMaterialUploadJoddHttpRequestExecutor(requestHttp);
		case OK_HTTP:
			return new WxOpenMaterialUploadOkhttpRequestExecutor(requestHttp);
		default:
			return null;
		}
	}
}
