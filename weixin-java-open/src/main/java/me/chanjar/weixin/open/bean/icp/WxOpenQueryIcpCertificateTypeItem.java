package me.chanjar.weixin.open.bean.icp;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

/**
 * 获取证件类型
 * @author byk
 *
 */
public class WxOpenQueryIcpCertificateTypeItem implements Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@SerializedName("type")
	private Integer type;

	@SerializedName("subject_type")
	private Integer subjectType;

	@SerializedName("name")
	private String name;

	@SerializedName("remark")
	private String remark;

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getSubjectType() {
		return subjectType;
	}

	public void setSubjectType(Integer subjectType) {
		this.subjectType = subjectType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}


}
