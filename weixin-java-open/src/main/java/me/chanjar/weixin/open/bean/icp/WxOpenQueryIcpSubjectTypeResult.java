package me.chanjar.weixin.open.bean.icp;

import java.io.Serializable;
import java.util.List;

/**
 * 获取单位性质
 * @author byk
 *
 */
public class WxOpenQueryIcpSubjectTypeResult implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 单位性质列表
	 */
	private List<WxOpenQueryIcpSubjectTypeItem> items;

	public List<WxOpenQueryIcpSubjectTypeItem> getItems() {
		return items;
	}
	public void setItems(List<WxOpenQueryIcpSubjectTypeItem> items) {
		this.items = items;
	}


}
