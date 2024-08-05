package me.chanjar.weixin.open.bean.icp;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

/**
 * 单位性质列表
 * @author byk
 *
 */
public class WxOpenQueryIcpSubjectTypeItem implements Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 单位性质类型id
	 */
	@SerializedName("type")
	private Integer type;

	/**
	 * 名称
	 */
	@SerializedName("name")
	private String name;

	/**
	 * 	备注
	 */
	@SerializedName("remark")
	private String remark;

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
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
