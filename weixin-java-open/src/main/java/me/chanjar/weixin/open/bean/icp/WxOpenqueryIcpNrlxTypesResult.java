package me.chanjar.weixin.open.bean.icp;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import me.chanjar.weixin.open.bean.result.WxOpenResult;

/**
 * 获取前置审批项类型
 * @author byk
 *
 */
public class WxOpenqueryIcpNrlxTypesResult extends WxOpenResult{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 前置审批项类型列表
	 */
	@SerializedName("items")
	private List<WxOpenqueryIcpNrlxTypeItem> items;

	public List<WxOpenqueryIcpNrlxTypeItem> getItems() {
		return items;
	}

	public void setItems(List<WxOpenqueryIcpNrlxTypeItem> items) {
		this.items = items;
	}


}
