package me.chanjar.weixin.open.bean.icp;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class WxOpenIcpEntranceInfoData implements Serializable{


	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 备案状态，取值参考备案状态枚举，示例值：1024
	 */
	@SerializedName("status")
	private Integer status;

	/**
	 * 是否正在注销备案
	 */
	@SerializedName("is_canceling")
	private Boolean isCanceling;

	/**
	 * 驳回原因，备案不通过时返回
	 */
	@SerializedName("audit_data")
	private WxOpenIcpEntranceAuditData auditData;

	/**
	 * 备案入口是否对该小程序开放，0：不开放，1：开放。特定情况下入口不会开放，如小程序昵称包含某些关键词时、管局系统不可用时，当备案入口开放时才能提交备案申请
	 */
	@SerializedName("available")
	private Integer available;

	/**
	 * 管局短信核验状态，仅当备案状态为 4（管局审核中）的时候才有效。1：等待核验中，2：核验完成，3：核验超时。
	 */
	@SerializedName("sms_verify_status")
	private Integer smsVerifyStatus;

	
}
