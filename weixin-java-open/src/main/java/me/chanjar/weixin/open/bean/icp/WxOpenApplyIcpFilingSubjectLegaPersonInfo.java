package me.chanjar.weixin.open.bean.icp;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 法人信息（非个人备案，且主体负责人不是法人时，必填）
 * @author byk
 *
 */
@Getter
@Setter
@NoArgsConstructor
public class WxOpenApplyIcpFilingSubjectLegaPersonInfo implements Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 法人代表姓名
	 */
	@SerializedName("name")
	private String name;

	/**
	 * 法人证件号码
	 */
	@SerializedName("certificate_number")
	private String certificateNumber;

	


}
