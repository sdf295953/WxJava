package me.chanjar.weixin.open.bean.icp;

import java.io.Serializable;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 获取单位性质
 * @author byk
 *
 */
@Getter
@Setter
@NoArgsConstructor
public class WxOpenQueryIcpSubjectTypeResult implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 单位性质列表
	 */
	private List<WxOpenQueryIcpSubjectTypeItem> items;

	


}
