package me.chanjar.weixin.open.bean.icp;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 其他备案媒体材料
 * @author byk
 *
 */
@Getter
@Setter
@NoArgsConstructor
public class WxOpenApplyIcpFilingMaterials {

	/**
	 * 互联网信息服务承诺书 media_id，最多上传1个
	 */
	@SerializedName("commitment_letter")
	private List<String> commitmentLetter;

	/**
	 * 主体更名函 media_id(非个人类型，且发生过更名时需要上传)，最多上传1个
	 */
	@SerializedName("business_name_change_letter")
	private List<String> businessNameChangeLetter;

	/**
	 * 党建确认函 media_id，最多上传1个
	 */
	@SerializedName("party_building_confirmation_letter")
	private List<String> partyBuildingConfirmationLetter;

	/**
	 * 承诺视频 media_id，最多上传1个
	 */
	@SerializedName("promise_video")
	private List<String> promiseVideo;

	/**
	 * 网站备案信息真实性责任告知书 media_id，最多上传1个
	 */
	@SerializedName("authenticity_responsibility_letter")
	private List<String> authenticityResponsibilityLetter;

	/**
	 * 小程序备案信息真实性承诺书 media_id，最多上传1个
	 */
	@SerializedName("authenticity_commitment_letter")
	private List<String> authenticityCommitmentLetter;

	/**
	 * 小程序建设方案书 media_id，最多上传1个
	 */
	@SerializedName("website_construction_proposal")
	private List<String> websiteConstructionProposal;

	/**
	 * 主体其它附件 media_id，最多上传10个
	 */
	@SerializedName("subject_other_materials")
	private List<String> subjectOtherMaterials;

	/**
	 * 小程序其它附件 media_id，最多上传10个
	 */
	@SerializedName("applets_other_materials")
	private List<String> appletsOtherMaterials;

	/**
	 * 手持证件照 media_id，最多上传1个
	 */
	@SerializedName("holding_certificate_photo")
	private List<String> holdingCertificatePhoto;

	
}
