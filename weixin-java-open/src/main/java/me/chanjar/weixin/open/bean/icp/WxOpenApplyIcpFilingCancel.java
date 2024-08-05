package me.chanjar.weixin.open.bean.icp;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

/**
 * 注销小程序备案
 * @author byk
 *
 */
public class WxOpenApplyIcpFilingCancel implements Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 注销类型：1 -- 注销主体, 2 -- 注销小程序, 3 -- 注销微信小程序
	 */
	@SerializedName("cancel_type")
	private Integer cancelType;

	public Integer getCancelType() {
		return cancelType;
	}

	public void setCancelType(Integer cancelType) {
		this.cancelType = cancelType;
	}


}
