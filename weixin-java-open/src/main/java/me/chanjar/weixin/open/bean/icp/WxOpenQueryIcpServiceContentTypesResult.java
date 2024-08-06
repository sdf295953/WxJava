package me.chanjar.weixin.open.bean.icp;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import me.chanjar.weixin.open.bean.result.WxOpenResult;

/**
 *
 * @author byk
 *
 */
@Getter
@Setter
@NoArgsConstructor
public class WxOpenQueryIcpServiceContentTypesResult extends WxOpenResult{

	/**
	 * 获取小程序服务内容类型
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 服务内容类型列表
	 */
	private List<WxOpenQueryIcpServiceContentTypesItem> items;
	


}
