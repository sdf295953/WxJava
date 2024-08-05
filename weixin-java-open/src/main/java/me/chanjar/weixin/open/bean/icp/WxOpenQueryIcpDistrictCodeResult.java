package me.chanjar.weixin.open.bean.icp;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import me.chanjar.weixin.open.bean.result.WxOpenResult;

/**
 * 获取区域信息
 * @author byk
 *
 */
public class WxOpenQueryIcpDistrictCodeResult extends WxOpenResult{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	@SerializedName("items")
	private List<WxOpenQueryIcpDistrictCodeSub> items;

	public List<WxOpenQueryIcpDistrictCodeSub> getItems() {
		return items;
	}

	public void setItems(List<WxOpenQueryIcpDistrictCodeSub> items) {
		this.items = items;
	}


}
