package me.chanjar.weixin.open.bean.icp;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import me.chanjar.weixin.open.bean.result.WxOpenResult;

/**
 * 错误提示
 * @author byk
 *
 */
@Getter
@Setter
@NoArgsConstructor
public class WxOpenApplyIcpFilingHint extends WxOpenResult {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * 校验失败的字段
	 */
	@SerializedName("err_field")
	private String errField;


	




}
