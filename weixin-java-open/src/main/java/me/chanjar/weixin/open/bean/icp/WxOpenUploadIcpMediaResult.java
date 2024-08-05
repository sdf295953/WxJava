package me.chanjar.weixin.open.bean.icp;

import com.google.gson.annotations.SerializedName;

import me.chanjar.weixin.mp.util.json.WxMpGsonBuilder;
import me.chanjar.weixin.open.bean.result.WxOpenResult;

public class WxOpenUploadIcpMediaResult extends WxOpenResult {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@SerializedName("type")
	private String type;

	@SerializedName("media_id")
	private String mediaId;

	@SerializedName("created_at")
	private String createdAt;

	public static WxOpenUploadIcpMediaResult fromJson(String json) {
	    return WxMpGsonBuilder.create().fromJson(json, WxOpenUploadIcpMediaResult.class);
	  }

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMediaId() {
		return mediaId;
	}

	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

}
