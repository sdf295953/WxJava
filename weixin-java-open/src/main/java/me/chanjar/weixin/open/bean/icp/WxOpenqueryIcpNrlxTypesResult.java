package me.chanjar.weixin.open.bean.icp;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import me.chanjar.weixin.open.bean.result.WxOpenResult;

/**
 * 获取前置审批项类型
 * @author byk
 *
 */
@Getter
@Setter
@NoArgsConstructor
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

	

}
