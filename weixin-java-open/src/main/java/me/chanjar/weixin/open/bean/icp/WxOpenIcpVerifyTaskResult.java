package me.chanjar.weixin.open.bean.icp;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import me.chanjar.weixin.open.bean.result.WxOpenResult;

/**
 * 查询人脸核身任务状态返回
 *
 * @author byk
 *
 */
@Getter
@Setter
@NoArgsConstructor
public class WxOpenIcpVerifyTaskResult extends WxOpenResult {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@SerializedName("is_finish")
	private Boolean isFinish;

	@SerializedName("face_status")
	private Integer faceStatus;

	

}
