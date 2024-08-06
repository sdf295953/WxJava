package me.chanjar.weixin.open.bean.icp;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 获取证件类型
 * @author byk
 *
 */
@Getter
@Setter
@NoArgsConstructor
public class WxOpenQueryIcpCertificateTypeItem implements Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@SerializedName("type")
	private Integer type;

	@SerializedName("subject_type")
	private Integer subjectType;

	@SerializedName("name")
	private String name;

	@SerializedName("remark")
	private String remark;

	

}
