package me.chanjar.weixin.open.bean.icp;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

/**
 * 申请小程序备案  参数
 * @author byk
 *
 */
public class WxOpenApplyIcpFilingInfo implements Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 备案主体信息
	 */
	@SerializedName("icp_subject")
	private WxOpenApplyIcpFilingSubjectInfo icpSubject;

	/**
	 * 微信小程序信息
	 */
	@SerializedName("icp_applets")
	private WxOpenApplyIcpFilingAppletsInfo icpApplets;

	/**
	 * 其他备案媒体材料
	 */
	@SerializedName("icp_materials")
	private WxOpenApplyIcpFilingMaterials icpMaterials;

	public WxOpenApplyIcpFilingSubjectInfo getIcpSubject() {
		return icpSubject;
	}

	public void setIcpSubject(WxOpenApplyIcpFilingSubjectInfo icpSubject) {
		this.icpSubject = icpSubject;
	}

	public WxOpenApplyIcpFilingAppletsInfo getIcpApplets() {
		return icpApplets;
	}

	public void setIcpApplets(WxOpenApplyIcpFilingAppletsInfo icpApplets) {
		this.icpApplets = icpApplets;
	}

	public WxOpenApplyIcpFilingMaterials getIcpMaterials() {
		return icpMaterials;
	}

	public void setIcpMaterials(WxOpenApplyIcpFilingMaterials icpMaterials) {
		this.icpMaterials = icpMaterials;
	}


}
