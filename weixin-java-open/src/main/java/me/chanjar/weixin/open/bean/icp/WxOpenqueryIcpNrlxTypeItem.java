package me.chanjar.weixin.open.bean.icp;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

/**
 * 前置审批项类型列表
 * @author byk
 *
 */
public class WxOpenqueryIcpNrlxTypeItem implements Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 前置审批项类型id
	 */
	@SerializedName("type")
	private Integer type;

	/**
	 * 名称
	 */
	@SerializedName("name")
	private String name;

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


}
