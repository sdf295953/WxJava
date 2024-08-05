package me.chanjar.weixin.open.api.impl;

import cn.binarywang.wx.miniapp.json.WxMaGsonBuilder;
import me.chanjar.weixin.common.error.WxErrorException;
import me.chanjar.weixin.open.api.WxOpenMaIcpService;
import me.chanjar.weixin.open.api.WxOpenService;
import me.chanjar.weixin.open.bean.icp.*;
import me.chanjar.weixin.open.bean.result.WxOpenResult;
import me.chanjar.weixin.open.executor.material.WxOpenMaterialUploadRequestExecutor;
import com.google.gson.Gson;

public class WxOpenMaIcpServiceImpl extends WxOpenServiceApacheHttpClientImpl implements WxOpenMaIcpService {

  private WxOpenService wxOpenService;

  public WxOpenMaIcpServiceImpl(WxOpenService wxOpenService){
    this.wxOpenService=wxOpenService;
  }
  /**
   * 查询人脸核身任务状态
   */
  @Override
  public WxOpenIcpVerifyTaskResult queryIcpVerifyTask(String taskId) throws WxErrorException {
    String response = post(QUERY_ICP_VERIFY_TASK, taskId);
    return WxMaGsonBuilder.create().fromJson(response, WxOpenIcpVerifyTaskResult.class);
  }

  /**
   * 发起小程序管理员人脸核身
   */
  @Override
  public WxOpenIcpCreateIcpVerifyTaskResult createIcpVerifyTask() throws WxErrorException {
    String response = post(CREATE_ICP_VERIFY_TASK, "");
    return WxMaGsonBuilder.create().fromJson(response, WxOpenIcpCreateIcpVerifyTaskResult.class);
  }

  /**
   * 上传小程序备案媒体材料
   */
  @Override
  public WxOpenUploadIcpMediaResult uploadIcpMedia(WxOpenUploadIcpMedia param) throws WxErrorException {
    return execute(WxOpenMaterialUploadRequestExecutor.create(this), UPLOAD_ICP_MEDIA, param);
  }

  /**
   * 撤回小程序备案申请
   */
  @Override
  public WxOpenResult cancelApplyIcpFiling() throws WxErrorException {
    String response = post(CANCEL_APPLY_ICP_FILING, "");
    return WxMaGsonBuilder.create().fromJson(response, WxOpenResult.class);
  }

  /**
   * 申请小程序备案
   */
  @Override
  public WxOpenApplyIcpFilingResult applyIcpFiling(Gson param, String appId) throws WxErrorException {
    String url = APPLY_ICP_FILING + "?access_token=" + wxOpenService.getWxOpenComponentService().getAuthorizerAccessToken(appId, false);

    String response = post(url, param.toString());
    return WxMaGsonBuilder.create().fromJson(response, WxOpenApplyIcpFilingResult.class);
  }

  /**
   * 注销小程序备案
   */
  @Override
  public WxOpenResult cancelIcpfiling(Integer cancelType) throws WxErrorException {
    WxOpenApplyIcpFilingCancel cancel = new WxOpenApplyIcpFilingCancel();
    cancel.setCancelType(cancelType);

    String response = post(CANCEL_ICP_FILING, WxMaGsonBuilder.create().toJson(cancel));
    return WxMaGsonBuilder.create().fromJson(response, WxOpenResult.class);
  }

  /**
   * 获取小程序备案状态及驳回原因
   */
  @Override
  public WxOpenIcpEntranceInfoResult getIcpEntranceInfo() throws WxErrorException {
    String response = get(GETICP_ENTRANCE_INFO, "");
    return WxMaGsonBuilder.create().fromJson(response, WxOpenIcpEntranceInfoResult.class);
  }

  /**
   * 获取小程序已备案详情
   */
  @Override
  public WxOpenApplyIcpFilingInfo getOnlineIcpOrder() throws WxErrorException {
    String response = get(GET_ONLINE_ICP_ORDER, "");
    return WxMaGsonBuilder.create().fromJson(response, WxOpenApplyIcpFilingInfo.class);
  }

  /**
   * 获取小程序服务内容类型
   */
  @Override
  public WxOpenQueryIcpServiceContentTypesResult queryIcpServiceContentTypes() throws WxErrorException {
    String response = get(QUERY_ICP_SERVICE_CONTENT_TYPES, "");
    return WxMaGsonBuilder.create().fromJson(response, WxOpenQueryIcpServiceContentTypesResult.class);
  }

  /**
   * 获取证件类型
   */
  @Override
  public WxOpenQueryIcpCertificateTypeResult queryIcpCertificateTypes() throws WxErrorException {
    String response = get(QUERY_ICP_CERTIFICATE_TYPES, "");

    return WxMaGsonBuilder.create().fromJson(response, WxOpenQueryIcpCertificateTypeResult.class);
  }

  /**
   * 获取区域信息
   */
  @Override
  public WxOpenQueryIcpDistrictCodeResult queryIcpDistrictCode() throws WxErrorException {
    String response = get(QUERY_ICP_DISTRICT_CODE, "");
    return WxMaGsonBuilder.create().fromJson(response, WxOpenQueryIcpDistrictCodeResult.class);
  }

  /**
   * 获取前置审批项类型
   */
  @Override
  public WxOpenqueryIcpNrlxTypesResult queryIcpNrlxTypes() throws WxErrorException {
    String response = get(QUERY_ICP_NRLX_TYPES, "");
    return WxMaGsonBuilder.create().fromJson(response, WxOpenqueryIcpNrlxTypesResult.class);
  }

  /**
   * 获取单位性质
   */
  @Override
  public WxOpenQueryIcpSubjectTypeResult queryIcpSubjectTypes() throws WxErrorException {
    String response = get(QUERY_ICP_SUBJECT_TYPES, "");
    return WxMaGsonBuilder.create().fromJson(response, WxOpenQueryIcpSubjectTypeResult.class);
  }
}
