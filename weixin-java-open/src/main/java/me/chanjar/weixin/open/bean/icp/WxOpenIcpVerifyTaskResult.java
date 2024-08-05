package me.chanjar.weixin.open.bean.icp;

import com.google.gson.annotations.SerializedName;

import me.chanjar.weixin.open.bean.result.WxOpenResult;

/**
 * 查询人脸核身任务状态返回
 *
 * @author byk
 *
 */

public class WxOpenIcpVerifyTaskResult extends WxOpenResult {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@SerializedName("is_finish")
	private Boolean isFinish;

	@SerializedName("face_status")
	private Integer faceStatus;

	public Boolean getIsFinish() {
		return isFinish;
	}

	public void setIsFinish(Boolean isFinish) {
		this.isFinish = isFinish;
	}

	public Integer getFaceStatus() {
		return faceStatus;
	}

	public void setFaceStatus(Integer faceStatus) {
		this.faceStatus = faceStatus;
	}

}
