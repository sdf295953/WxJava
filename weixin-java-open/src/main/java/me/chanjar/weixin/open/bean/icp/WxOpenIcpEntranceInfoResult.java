package me.chanjar.weixin.open.bean.icp;

import me.chanjar.weixin.open.bean.result.WxOpenResult;

/**
 * 获取小程序备案状态及驳回原因
 * @author byk
 *
 */
public class WxOpenIcpEntranceInfoResult extends WxOpenResult{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 备案状态信息
	 */
	private WxOpenIcpEntranceInfoData info;

	public WxOpenIcpEntranceInfoData getInfo() {
		return info;
	}

	public void setInfo(WxOpenIcpEntranceInfoData info) {
		this.info = info;
	}


}
