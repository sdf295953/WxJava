package me.chanjar.weixin.open.bean.icp;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

/**
 * 主体额外信息（个人备案时，如果存在与主体负责人信息相同的字段，则填入相同的值）
 * @author byk
 *
 */
public class WxOpenApplyIcpFilingSubjectOrganizeInfo implements Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 主体证件类型，
	 * 示例值：2(参考：获取证件类型接口)
	 */
	@SerializedName("certificate_type")
	private String type;

	/**
	 * 主体证件号码，
	 * 示例值："110105199001011234"
	 */
	@SerializedName("certificate_number")
	private String number;

	/**
	 * 主体证件住所，
	 * 示例值："北京市朝阳区高碑店路181号1栋12345室"
	 */
	@SerializedName("certificate_address")
	private String address;

	/**
	 * 主体证件照片 media_id，
	 * 如果小程序主体为非个人类型，则必填
	 */
	@SerializedName("certificate_photo")
	private String photo;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	@Override
	public String toString() {
		return "WxOpenApplyIcpFilingSubjectOrganizeInfo [type=" + type + ", number=" + number + ", address=" + address + ", photo=" + photo + "]";
	}


}
