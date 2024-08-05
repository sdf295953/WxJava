package me.chanjar.weixin.open.bean.icp;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import me.chanjar.weixin.open.bean.result.WxOpenResult;
import org.jetbrains.annotations.Nullable;

import java.io.Serializable;
import java.util.List;


/**
 * 微信小程序信息
 * @author byk
 *
 */
@Getter
@Setter
@NoArgsConstructor
public class WxOpenApplyIcpFilingAppletsBaseInfo  extends WxOpenResult implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 小程序ID，不用填写，后台自动拉取
	 */
	@SerializedName("appid")

	private String appid;

	/**
	 * 小程序名称，不用填写，后台自动拉取
	 */
	@SerializedName("name")
	private String name;

	/**
	 * 小程序服务内容类型，只能填写二级服务内容类型，最多5个
	 */
	@SerializedName("service_content_types")
	private List<Integer> serviceContentTypes;

	/**
	 * 前置审批项，列表中不能存在重复的前置审批类型id，如不涉及前置审批项，也需要填“以上都不涉及”
	 */
	@SerializedName("nrlx_details")
	private List<WxOpenApplyIcpFilingAppletsNrlxDetailItem> nrlxDetails;

	/**
	 * 请具体描述小程序实际经营内容、主要服务内容，该信息为主管部门审核重要依据，备注内容字数限制20-200字，请认真填写。
	 */
	@SerializedName("comment")
	private String comment;

	/**
	 * 小程序备案号，示例值：粤B2-20090059-1626X
	 * （申请小程序备案时不用填写，查询已备案详情时会返回）
	 */
	@SerializedName("record_number")
	private String recordNumber;

}
