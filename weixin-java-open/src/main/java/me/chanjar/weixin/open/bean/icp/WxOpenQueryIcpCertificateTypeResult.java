package me.chanjar.weixin.open.bean.icp;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import me.chanjar.weixin.open.bean.result.WxOpenResult;

/**
 * 获取证件类型
 * @author byk
 *
 */
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

	public List<WxOpenQueryIcpCertificateTypeItem> getItems() {
		return items;
	}

	public void setItems(List<WxOpenQueryIcpCertificateTypeItem> items) {
		this.items = items;
	}

}
