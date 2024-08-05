package me.chanjar.weixin.open.bean.icp;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

/**
 * 微信小程序信息
 * @author byk
 *
 */
public class WxOpenApplyIcpFilingAppletsInfo implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 微信小程序基本信息
	 */
	@SerializedName("base_info")
	private WxOpenApplyIcpFilingAppletsBaseInfo basInfo;

	/**
	 * 小程序负责人信息
	 */
	@SerializedName("principal_info")
	private WxOpenApplyIcpFilingAppletsPrincipalInfo principalInfo;

	public WxOpenApplyIcpFilingAppletsBaseInfo getBasInfo() {
		return basInfo;
	}

	public void setBasInfo(WxOpenApplyIcpFilingAppletsBaseInfo basInfo) {
		this.basInfo = basInfo;
	}

	public WxOpenApplyIcpFilingAppletsPrincipalInfo getPrincipalInfo() {
		return principalInfo;
	}

	public void setPrincipalInfo(WxOpenApplyIcpFilingAppletsPrincipalInfo principalInfo) {
		this.principalInfo = principalInfo;
	}


}
