package me.chanjar.weixin.open.bean.icp;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 前置审批项类型列表
 * @author byk
 *
 */
@Getter
@Setter
@NoArgsConstructor
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

	

}
