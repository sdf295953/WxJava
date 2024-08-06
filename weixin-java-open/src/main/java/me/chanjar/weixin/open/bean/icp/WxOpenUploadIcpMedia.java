package me.chanjar.weixin.open.bean.icp;

import java.io.File;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 文件上传
 *
 * @author byk
 *
 */
@Getter
@Setter
@NoArgsConstructor
public class WxOpenUploadIcpMedia implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 媒体材料类型。目前支持两种：图片("image")和视频("video")，示例值："image"
	 */
	@SerializedName("type")
	private String type;

	/**
	 * 证件类型(参考：获取证件类型)，如果上传的是证件媒体材料，则必填，示例值：2
	 */
	@SerializedName("certificate_type")
	private String certificateType;

	/**
	 * 媒体材料所属的备案字段名(参考：申请小程序备案接口)，如要用于多个备案字段，则填写其中一个字段名即可。
	 * 例如：要上传身份证头像面照片作为备案主体负责人和小程序负责人的证件照正面， 就填写
	 * "icp_subject.principal_info.certificate_photo_front"
	 */
	@SerializedName("icp_order_field")
	private String icpOrderField;

	/**
	 * 待上传的图片或视频的二进制内容
	 */
	private File media;

	

	public Map<String, String> getForm() {
		Map<String, String> form = new HashMap<>();
		form.put("type", this.type);
		form.put("icp_order_field", this.icpOrderField);
		if (certificateType != null) {
			form.put("certificate_type", this.certificateType);
		}

		return form;
	}

	
}
