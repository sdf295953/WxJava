package me.chanjar.weixin.open.bean.icp;

import com.fasterxml.jackson.annotation.JsonProperty;

import me.chanjar.weixin.open.bean.result.WxOpenResult;

/**
 * 发起人脸核验验证
 * @author byk
 *
 */
public class WxOpenIcpCreateIcpVerifyTaskResult extends WxOpenResult{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@JsonProperty("task_id")
	private String taskId;

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}


}
