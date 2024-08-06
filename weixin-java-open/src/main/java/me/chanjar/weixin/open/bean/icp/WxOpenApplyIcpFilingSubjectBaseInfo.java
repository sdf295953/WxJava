package me.chanjar.weixin.open.bean.icp;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 备案主体信息
 * @author byk
 *
 */
@Getter
@Setter
@NoArgsConstructor
public class WxOpenApplyIcpFilingSubjectBaseInfo implements Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 主体性质，示例值：5
	 */
	@SerializedName("type")
	private Integer type;

	/**
	 * 主办单位名称
	 */
	@SerializedName("name")
	private String name;

	/**
	 * 备案省份
	 * 使用省份代码，示例值："110000"(参考：获取区域信息接口)
	 */
	@SerializedName("province")
	private String province;

	/**
	 * 备案城市
	 * 使用城市代码，示例值："110100"(参考：获取区域信息接口)
	 */
	@SerializedName("city")
	private String city;

	/**
	 * 备案县区
	 * 使用县区代码，示例值："110105"(参考：获取区域信息接口)
	 */
	@SerializedName("district")
	private String district;

	/**
	 * 通讯地址，必须属于备案省市区，地址开头的省市区不用填入，
	 * 例如：通信地址为“北京市朝阳区高碑店路181号1栋12345室”时，
	 * 只需要填写 "高碑店路181号1栋12345室" 即可
	 */
	@SerializedName("address")
	private String address;

	/**
	 * 主体信息备注，根据需要，如实填写
	 */
	@SerializedName("comment")
	private String comment;

	/**
	 * 主体备案号，示例值：粤B2-20090059（申请小程序备案时不用填写，查询已备案详情时会返回）
	 */
	@SerializedName("record_number")
	private String recordNumber;

	

}
