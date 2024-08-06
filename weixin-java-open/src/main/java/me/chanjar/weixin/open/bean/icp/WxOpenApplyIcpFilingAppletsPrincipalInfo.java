package me.chanjar.weixin.open.bean.icp;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 小程序负责人信息
 * @author byk
 *
 */
@Getter
@Setter
@NoArgsConstructor
public class WxOpenApplyIcpFilingAppletsPrincipalInfo implements Serializable{


	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 负责人姓名
	 */
	@SerializedName("name")
	private String name;

	/**
	 * 负责人联系方式
	 */
	@SerializedName("mobile")
	private String mobile;

	/**
	 * 负责人电子邮件
	 */
	@SerializedName("email")
	private String email;

	/**
	 * 负责人应急联系方式
	 */
	@SerializedName("emergency_contact")
	private String emergencyContact;

	/**
	 * 负责人证件类型，示例值：2(参考：获取证件类型接口，此处只能填入单位性质属于个人的证件类型)
	 */
	@SerializedName("certificate_type")
	private Integer certificateType;

	/**
	 * 负责人证件号码
	 */
	@SerializedName("certificate_number")
	private String certificateNumber;

	/**
	 * 负责人证件有效期起始日期，
	 * 格式为 YYYYmmdd，示例值："20230815"
	 */
	@SerializedName("certificate_validity_date_start")
	private String certificateValidityDateStart;

	/**
	 * 负责人证件有效期终止日期，
	 * 格式为 YYYYmmdd，
	 * 如证件长期有效，请填写 "长期"，示例值："20330815"
	 */
	@SerializedName("certificate_validity_date_end")
	private String certificateValidityDateEnd;

	/**
	 * 负责人证件正面照片 media_id
	 * （身份证为人像面）
	 */
	@SerializedName("certificate_photo_front")
	private String certificatePhotoFront;

	/**
	 * 负责人证件背面照片 media_id
	 * （身份证为国徽面）
	 */
	@SerializedName("certificate_photo_back")
	private String certificatePhotoBack;

	/**
	 * 授权书 media_id，
	 * 当主体负责人不是法人时需要主体负责人授权书，
	 * 当小程序负责人不是法人时需要小程序负责人授权书
	 */
	@SerializedName("authorization_letter")
	private String authorizationLetter;

	/**
	 * 扫脸认证任务id(扫脸认证接口返回的task_id)，
	 * 仅小程序负责人需要扫脸，主体负责人无需扫脸
	 */
	@SerializedName("verify_task_id")
	private String verifyTaskId;

	

}
