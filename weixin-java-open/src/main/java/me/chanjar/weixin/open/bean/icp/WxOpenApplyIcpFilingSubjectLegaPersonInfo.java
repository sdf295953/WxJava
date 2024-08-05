package me.chanjar.weixin.open.bean.icp;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

/**
 * 法人信息（非个人备案，且主体负责人不是法人时，必填）
 * @author byk
 *
 */
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCertificateNumber() {
		return certificateNumber;
	}

	public void setCertificateNumber(String certificateNumber) {
		this.certificateNumber = certificateNumber;
	}

	@Override
	public String toString() {
		return "WxOpenApplyIcpFilingSubjectLegaPersonInfo [name=" + name + ", certificateNumber=" + certificateNumber + "]";
	}


}
