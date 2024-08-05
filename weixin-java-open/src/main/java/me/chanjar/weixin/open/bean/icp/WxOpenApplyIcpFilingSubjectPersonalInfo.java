package me.chanjar.weixin.open.bean.icp;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

/**
 * 个人主体额外信息
 */
public class WxOpenApplyIcpFilingSubjectPersonalInfo implements Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 临时居住证明照片 media_id，个人备案且非本省人员，需要提供居住证、暂住证、社保证明、房产证等临时居住证明，
	 */
	@SerializedName("residence_permit")
	private String residencePermit;

	public String getResidencePermit() {
		return residencePermit;
	}

	public void setResidencePermit(String residencePermit) {
		this.residencePermit = residencePermit;
	}

	@Override
	public String toString() {
		return "WxOpenApplyIcpFilingSubjectPersonalInfo [residencePermit=" + residencePermit + "]";
	}


}
