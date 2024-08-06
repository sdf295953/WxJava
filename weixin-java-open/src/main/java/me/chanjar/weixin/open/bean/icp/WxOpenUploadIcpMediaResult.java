package me.chanjar.weixin.open.bean.icp;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import me.chanjar.weixin.mp.util.json.WxMpGsonBuilder;
import me.chanjar.weixin.open.bean.result.WxOpenResult;

@Getter
@Setter
@NoArgsConstructor
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

	

}
