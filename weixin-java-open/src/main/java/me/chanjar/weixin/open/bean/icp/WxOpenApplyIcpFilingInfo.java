package me.chanjar.weixin.open.bean.icp;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 申请小程序备案  参数
 * @author byk
 *
 */
@Getter
@Setter
@NoArgsConstructor
public class WxOpenApplyIcpFilingInfo implements Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 备案主体信息
	 */
	@SerializedName("icp_subject")
	private WxOpenApplyIcpFilingSubjectInfo icpSubject;

	/**
	 * 微信小程序信息
	 */
	@SerializedName("icp_applets")
	private WxOpenApplyIcpFilingAppletsInfo icpApplets;

	/**
	 * 其他备案媒体材料
	 */
	@SerializedName("icp_materials")
	private WxOpenApplyIcpFilingMaterials icpMaterials;

	
}
