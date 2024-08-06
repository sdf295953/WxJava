package me.chanjar.weixin.open.bean.icp;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author byk
 *
 */
@Getter
@Setter
@NoArgsConstructor
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

	
}
