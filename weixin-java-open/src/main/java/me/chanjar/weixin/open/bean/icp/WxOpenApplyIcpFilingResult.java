package me.chanjar.weixin.open.bean.icp;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import me.chanjar.weixin.open.bean.result.WxOpenResult;

/**
 * 申请小程序备案
 * @author byk
 *
 */
@Getter
@Setter
@NoArgsConstructor
public class WxOpenApplyIcpFilingResult  extends WxOpenResult{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 错误提示
	 */
	@SerializedName("hints")
	private List<WxOpenApplyIcpFilingHint> hints;

	


}
