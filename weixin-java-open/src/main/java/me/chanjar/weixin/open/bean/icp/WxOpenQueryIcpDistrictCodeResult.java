package me.chanjar.weixin.open.bean.icp;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import me.chanjar.weixin.open.bean.result.WxOpenResult;

/**
 * 获取区域信息
 * @author byk
 *
 */
@Getter
@Setter
@NoArgsConstructor
public class WxOpenQueryIcpDistrictCodeResult extends WxOpenResult{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	@SerializedName("items")
	private List<WxOpenQueryIcpDistrictCodeSub> items;

	

}
