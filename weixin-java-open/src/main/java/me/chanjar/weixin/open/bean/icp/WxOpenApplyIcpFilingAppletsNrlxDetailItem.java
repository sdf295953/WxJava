package me.chanjar.weixin.open.bean.icp;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

/**
 *
 * @author byk
 *
 */
public class WxOpenApplyIcpFilingAppletsNrlxDetailItem implements Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 前置审批类型，示例值：2
	 * (参考：获取前置审批项接口)
	 */
	@SerializedName("type")
	private Integer type;

	/**
	 * 前置审批号，如果前置审批类型不是“以上都不涉及”，
	 * 则必填，示例值："粤-12345号
	 */
	@SerializedName("code")
	private Integer code;

	/**
	 * 前置审批媒体材料 media_id
	 */
	@SerializedName("media")
	private Integer media;

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Integer getMedia() {
		return media;
	}

	public void setMedia(Integer media) {
		this.media = media;
	}


}
