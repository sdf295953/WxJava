package me.chanjar.weixin.open.bean.icp;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 单位性质列表
 * @author byk
 *
 */
@Getter
@Setter
@NoArgsConstructor
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

	
}
