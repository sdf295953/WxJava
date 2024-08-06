package me.chanjar.weixin.open.bean.icp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import me.chanjar.weixin.open.bean.result.WxOpenResult;

/**
 * 获取小程序备案状态及驳回原因
 * @author byk
 *
 */
@Getter
@Setter
@NoArgsConstructor
public class WxOpenIcpEntranceInfoResult extends WxOpenResult{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 备案状态信息
	 */
	private WxOpenIcpEntranceInfoData info;

	


}
