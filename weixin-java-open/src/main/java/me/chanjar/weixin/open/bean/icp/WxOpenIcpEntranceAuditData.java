package me.chanjar.weixin.open.bean.icp;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

/**
 * 驳回原因，备案不通过时返回
 * @author byk
 *
 */
public class WxOpenIcpEntranceAuditData implements Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 审核不通过的字段中文名
	 */
	@SerializedName("key_name")
	private String keyName;

	/**
	 * 字段不通过的原因
	 */
	@SerializedName("error")
	private String error;

	/**
	 * 修改建议
	 */
	@SerializedName("suggest")
	private String suggest;

	public String getKeyName() {
		return keyName;
	}

	public void setKeyName(String keyName) {
		this.keyName = keyName;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getSuggest() {
		return suggest;
	}

	public void setSuggest(String suggest) {
		this.suggest = suggest;
	}


}
