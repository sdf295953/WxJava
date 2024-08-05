package me.chanjar.weixin.open.bean.icp;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

/**
 *
 * @author byk
 *
 */
public class WxOpenApplyIcpFilingSubjectInfo implements Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 主体基本信息
	 */
	@SerializedName("base_info")
	private WxOpenApplyIcpFilingSubjectBaseInfo baseInfo;

	/**
	 * 个人主体额外信息
	 */
	@SerializedName("personal_info")
	private WxOpenApplyIcpFilingSubjectPersonalInfo personalInfo;

	/**
	 * 主体额外信息（个人备案时，如果存在与主体负责人信息相同的字段，则填入相同的值）
	 */
	@SerializedName("organize_info")
	private WxOpenApplyIcpFilingSubjectOrganizeInfo organizeInfo;

	/**
	 * 主体负责人信息
	 */
	@SerializedName("principal_info")
	private WxOpenApplyIcpFilingSubjectPrincipalInfo principalInfo;

	/**
	 * 法人信息（非个人备案，且主体负责人不是法人时，必填）
	 */
	@SerializedName("legal_person_info")
	private WxOpenApplyIcpFilingSubjectLegaPersonInfo legalPersonInfo;

	public WxOpenApplyIcpFilingSubjectBaseInfo getBaseInfo() {
		return baseInfo;
	}

	public void setBaseInfo(WxOpenApplyIcpFilingSubjectBaseInfo baseInfo) {
		this.baseInfo = baseInfo;
	}

	public WxOpenApplyIcpFilingSubjectPersonalInfo getPersonalInfo() {
		return personalInfo;
	}

	public void setPersonalInfo(WxOpenApplyIcpFilingSubjectPersonalInfo personalInfo) {
		this.personalInfo = personalInfo;
	}

	public WxOpenApplyIcpFilingSubjectOrganizeInfo getOrganizeInfo() {
		return organizeInfo;
	}

	public void setOrganizeInfo(WxOpenApplyIcpFilingSubjectOrganizeInfo organizeInfo) {
		this.organizeInfo = organizeInfo;
	}

	public WxOpenApplyIcpFilingSubjectPrincipalInfo getPrincipalInfo() {
		return principalInfo;
	}

	public void setPrincipalInfo(WxOpenApplyIcpFilingSubjectPrincipalInfo principalInfo) {
		this.principalInfo = principalInfo;
	}

	public WxOpenApplyIcpFilingSubjectLegaPersonInfo getLegalPersonInfo() {
		return legalPersonInfo;
	}

	public void setLegalPersonInfo(WxOpenApplyIcpFilingSubjectLegaPersonInfo legalPersonInfo) {
		this.legalPersonInfo = legalPersonInfo;
	}



}
