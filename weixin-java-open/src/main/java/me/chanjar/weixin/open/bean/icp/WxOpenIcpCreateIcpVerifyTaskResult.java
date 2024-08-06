package me.chanjar.weixin.open.bean.icp;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import me.chanjar.weixin.open.bean.result.WxOpenResult;

/**
 * 发起人脸核验验证
 * @author byk
 *
 */
@Getter
@Setter
@NoArgsConstructor
public class WxOpenIcpCreateIcpVerifyTaskResult extends WxOpenResult{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@JsonProperty("task_id")
	private String taskId;

	


}
