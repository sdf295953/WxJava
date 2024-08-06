package me.chanjar.weixin.open.bean.icp;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 驳回原因，备案不通过时返回
 * @author byk
 *
 */
@Getter
@Setter
@NoArgsConstructor
public class WxOpenIcpEntranceAuditData implements Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 审核不通过的字段中文名
	 */
	@SerializedName("key_name")
	private String keyName;

	/**
	 * 字段不通过的原因
	 */
	@SerializedName("error")
	private String error;

	/**
	 * 修改建议
	 */
	@SerializedName("suggest")
	private String suggest;

	

}
