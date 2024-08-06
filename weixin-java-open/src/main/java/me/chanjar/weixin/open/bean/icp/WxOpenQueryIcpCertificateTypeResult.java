package me.chanjar.weixin.open.bean.icp;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import me.chanjar.weixin.open.bean.result.WxOpenResult;

/**
 * 获取证件类型
 * @author byk
 *
 */
@Getter
@Setter
@NoArgsConstructor
public class WxOpenQueryIcpCertificateTypeResult extends WxOpenResult {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 证件类型列表
	 */
	@SerializedName("items")
	private List<WxOpenQueryIcpCertificateTypeItem> items;

	

}
