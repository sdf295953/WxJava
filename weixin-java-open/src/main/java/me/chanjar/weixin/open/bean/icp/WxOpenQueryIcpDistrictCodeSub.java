package me.chanjar.weixin.open.bean.icp;

import java.io.Serializable;
import java.util.List;

import com.google.gson.annotations.SerializedName;

/**
 * 下级区域信息列表
 * @author byk
 *
 */
public class WxOpenQueryIcpDistrictCodeSub implements Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 区域类型: 1 -- 省份，2 -- 市，3 -- 区
	 */
	@SerializedName("type")
	private Integer type;

	/**
	 * 区域代码
	 */
	@SerializedName("code")
	private Integer code;

	/**
	 * 下级区域信息列表
	 */
	@SerializedName("name")
	private String name;

	/**
	 * 下级区域信息列表
	 */
	@SerializedName("sub_list")
	private List<WxOpenQueryIcpDistrictCodeSub> subList;

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<WxOpenQueryIcpDistrictCodeSub> getSubList() {
		return subList;
	}

	public void setSubList(List<WxOpenQueryIcpDistrictCodeSub> subList) {
		this.subList = subList;
	}


}
