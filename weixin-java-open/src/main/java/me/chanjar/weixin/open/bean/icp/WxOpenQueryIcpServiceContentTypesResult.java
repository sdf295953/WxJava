package me.chanjar.weixin.open.bean.icp;

import java.util.List;

import me.chanjar.weixin.open.bean.result.WxOpenResult;

/**
 *
 * @author byk
 *
 */
public class WxOpenQueryIcpServiceContentTypesResult extends WxOpenResult{

	/**
	 * 获取小程序服务内容类型
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 服务内容类型列表
	 */
	private List<WxOpenQueryIcpServiceContentTypesItem> items;
	public List<WxOpenQueryIcpServiceContentTypesItem> getItems() {
		return items;
	}
	public void setItems(List<WxOpenQueryIcpServiceContentTypesItem> items) {
		this.items = items;
	}


}
