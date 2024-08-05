package me.chanjar.weixin.open.bean.icp;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import me.chanjar.weixin.open.bean.result.WxOpenResult;

/**
 * 申请小程序备案
 * @author byk
 *
 */
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

	public List<WxOpenApplyIcpFilingHint> getHints() {
		return hints;
	}

	public void setHints(List<WxOpenApplyIcpFilingHint> hints) {
		this.hints = hints;
	}

	@Override
	public String toString() {
		return "WxOpenApplyIcpFilingResult [hints=" + hints + "]";
	}


}
