package me.chanjar.weixin.open.bean.icp;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

/**
 * 服务内容类型列表
 * @author byk
 *
 */
public class WxOpenQueryIcpServiceContentTypesItem implements Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 服务内容类型id
	 */
	@SerializedName("type")
	private Integer type;

	/**
	 * 该服务内容类型的父类型id
	 */
	@SerializedName("parent_type")
	private Integer parentType;

	/**
	 * 名称
	 */
	@SerializedName("name")
	private String name;

	/**
	 * 备注
	 */
	@SerializedName("remark")
	private String remark;

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getParentType() {
		return parentType;
	}

	public void setParentType(Integer parentType) {
		this.parentType = parentType;
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
