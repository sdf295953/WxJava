package me.chanjar.weixin.open.bean.icp;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 微信小程序信息
 * @author byk
 *
 */
@Getter
@Setter
@NoArgsConstructor
public class WxOpenApplyIcpFilingAppletsInfo implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 微信小程序基本信息
	 */
	@SerializedName("base_info")
	private WxOpenApplyIcpFilingAppletsBaseInfo basInfo;

	/**
	 * 小程序负责人信息
	 */
	@SerializedName("principal_info")
	private WxOpenApplyIcpFilingAppletsPrincipalInfo principalInfo;

	


}
