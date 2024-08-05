package me.chanjar.weixin.open.bean.icp;

import com.google.gson.annotations.SerializedName;

import me.chanjar.weixin.open.bean.result.WxOpenResult;

/**
 * 错误提示
 * @author byk
 *
 */
public class WxOpenApplyIcpFilingHint extends WxOpenResult {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * 校验失败的字段
	 */
	@SerializedName("err_field")
	private String errField;


	public String getErrField() {
		return errField;
	}

	public void setErrField(String errField) {
		this.errField = errField;
	}

	@Override
	public String toString() {
		return "WxOpenApplyIcpFilingHint [errField=" + errField + "]";
	}



}
