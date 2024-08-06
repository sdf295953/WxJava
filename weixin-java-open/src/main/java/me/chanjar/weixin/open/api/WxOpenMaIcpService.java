package me.chanjar.weixin.open.api;


import me.chanjar.weixin.common.error.WxErrorException;
import me.chanjar.weixin.open.bean.icp.*;
import me.chanjar.weixin.open.bean.result.WxOpenResult;
import com.google.gson.Gson;

/**
 * 小程序备案
 *
 * @author byk
 *
 */
public interface WxOpenMaIcpService {

  /**
   * 查询人脸核身任务状态
   */
  String QUERY_ICP_VERIFY_TASK = "https://api.weixin.qq.com/wxa/icp/query_icp_verifytask";

  /**
   * 发起小程序管理员人脸核身
   */
  String CREATE_ICP_VERIFY_TASK = "https://api.weixin.qq.com/wxa/icp/create_icp_verifytask";

  /**
   * 上传小程序备案媒体材料
   */
  String UPLOAD_ICP_MEDIA = "https://api.weixin.qq.com/wxa/icp/upload_icp_media";

  /**
   * 撤回小程序备案申请
   */
  String CANCEL_APPLY_ICP_FILING = "https://api.weixin.qq.com/wxa/icp/cancel_apply_icp_filing";

  /**
   * 申请小程序备案
   */
  String APPLY_ICP_FILING = "https://api.weixin.qq.com/wxa/icp/apply_icp_filing";

  /**
   * 注销小程序备案
   */
  String CANCEL_ICP_FILING = "https://api.weixin.qq.com/wxa/icp/cancel_icp_filing";

  /**
   * 获取小程序备案状态及驳回原因
   */
  String GETICP_ENTRANCE_INFO = "https://api.weixin.qq.com/wxa/icp/get_icp_entrance_info";

  /**
   * 获取小程序已备案详情
   */
  String GET_ONLINE_ICP_ORDER = "https://api.weixin.qq.com/wxa/icp/get_online_icp_order";

  /**
   * 获取小程序服务内容类型
   */
  String QUERY_ICP_SERVICE_CONTENT_TYPES = "https://api.weixin.qq.com/wxa/icp/query_icp_service_content_types";

  /**
   * 获取证件类型
   */
  String QUERY_ICP_CERTIFICATE_TYPES = "https://api.weixin.qq.com/wxa/icp/query_icp_certificate_types";

  /**
   * 获取区域信息
   */
  String QUERY_ICP_DISTRICT_CODE = "https://api.weixin.qq.com/wxa/icp/query_icp_district_code";

  /**
   * 获取前置审批项类型
   */
  String QUERY_ICP_NRLX_TYPES = "https://api.weixin.qq.com/wxa/icp/query_icp_nrlx_types";

  /**
   * 获取单位性质
   */
  String QUERY_ICP_SUBJECT_TYPES = "https://api.weixin.qq.com/wxa/icp/query_icp_subject_types";

  /**
   * 查询人脸核身任务状态
   *
   * @param taskId
   * @return
   * @throws WxErrorException
   */
  public WxOpenIcpVerifyTaskResult queryIcpVerifyTask(String taskId) throws WxErrorException;

  /**
   * 发起小程序管理员人脸核身
   *
   * @return
   * @throws WxErrorException
   */
  public WxOpenIcpCreateIcpVerifyTaskResult createIcpVerifyTask() throws WxErrorException;

  /**
   * 上传小程序备案媒体材料
   *
   * @param param
   * @return
   * @throws WxErrorException
   */
  public WxOpenUploadIcpMediaResult uploadIcpMedia(WxOpenUploadIcpMedia param) throws WxErrorException;

  /**
   * 撤回小程序备案申请
   *
   * @return
   * @throws WxErrorException
   */
  public WxOpenResult cancelApplyIcpFiling() throws WxErrorException;


  /**
   * 申请小程序备案
   */
  public WxOpenApplyIcpFilingResult applyIcpFiling(Gson param, String appId) throws WxErrorException;

  /**
   * 注销小程序备案
   *
   * @param cancelType
   *            注销类型：1 -- 注销主体, 2 -- 注销小程序, 3 -- 注销微信小程序
   * @return
   */
  public WxOpenResult cancelIcpfiling(Integer cancelType) throws WxErrorException;

  /**
   * 获取小程序备案状态及驳回原因
   *
   * @return
   */
  public WxOpenIcpEntranceInfoResult getIcpEntranceInfo() throws WxErrorException;


  /**
   * 获取小程序已备案详情
   * @return
   */
  public WxOpenApplyIcpFilingInfo getOnlineIcpOrder() throws WxErrorException;


  /**
   * 获取小程序服务内容类型
   *
   * @return
   */
  public WxOpenQueryIcpServiceContentTypesResult queryIcpServiceContentTypes() throws WxErrorException;

  /**
   * 获取证件类型
   *
   * @return
   */
  public WxOpenQueryIcpCertificateTypeResult queryIcpCertificateTypes() throws WxErrorException;

  /**
   * 获取区域信息
   */
  public WxOpenQueryIcpDistrictCodeResult queryIcpDistrictCode() throws WxErrorException;

  /**
   * 获取前置审批项类型
   */
  public WxOpenqueryIcpNrlxTypesResult queryIcpNrlxTypes() throws WxErrorException;

  /**
   * 获取单位性质
   */
  public WxOpenQueryIcpSubjectTypeResult queryIcpSubjectTypes() throws WxErrorException;

}
