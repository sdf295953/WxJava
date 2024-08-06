package me.chanjar.weixin.open.bean.icp;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 服务内容类型列表
 * @author byk
 *
 */
@Getter
@Setter
@NoArgsConstructor
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

	

}
