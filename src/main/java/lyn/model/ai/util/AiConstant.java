package lyn.model.ai.util;

/**
 * @Title: 百度AI调用接口
 * @Description:
 * @Date:2018-05-22 上午 10:35
 * @author:liangyingnan
 */
public class AiConstant {

	/**
	 * 百度AppId
	 */
	public final static String BAIDU_APP_ID = "11279718";

	/**
	 *百度API Key
	 */
	public final static String  BAIDU_API_KEY = "HHKYs4BPbpQFBvw1GjoCKdus";

	/**
	 *百度Secret Key
	 */
	public final static String BAIDU_SECRET_KEY = "zIhRH1kxf6ZUZY78OQdIitvwghMWHGs9";

	/**
	 * 百度Access_Token
	 */
	public final static String BAIDU_ACCESS_TOKEN = AuthService.getAuth();

	/**
	 * 语音识别
	 */
	public final static String  SERVER_API = "http://vop.baidu.com/server_api";

	/**
	 *语音合成
	 */
	public final static String  TEXT2AUDIO = "http://tsn.baidu.com/text2audio";

	/**
	 * 通用文字识别
	 */
	public final static String  GENERAL_BASIC = "https://aip.baidubce.com/rest/2.0/ocr/v1/general_basic";

	/**
	 * 通用文字识别（含位置信息版）
	 */
	public final static String GENERAL  = "https://aip.baidubce.com/rest/2.0/ocr/v1/general";

	/**
	 * 通用文字识别（高精度版）
	 */
	public final static String  ACCURATE_BASIC = "https://aip.baidubce.com/rest/2.0/ocr/v1/accurate_basic";

	/**
	 * 通用文字识别（高精度含位置版）
	 */
	public final static String ACCURATE = "https://aip.baidubce.com/rest/2.0/ocr/v1/accurate";

	/**
	 *网络图片文字识别
	 */
	public final static String  WEBIMAGE = "https://aip.baidubce.com/rest/2.0/ocr/v1/webimage";

	/**
	 *身份证识别
	 */
	public final static String  IDCARD = "https://aip.baidubce.com/rest/2.0/ocr/v1/idcard";

	/**
	 * 银行卡识别
	 */
	public final static String  BANKCARD = "https://aip.baidubce.com/rest/2.0/ocr/v1/bankcard";

	/**
	 * 驾驶证识别
	 */
	public final static String  DRIVING_LICENSE  = "https://aip.baidubce.com/rest/2.0/ocr/v1/driving_license";

	/**
	 *行驶证识别
	 */
	public final static String VEHICLE_LICENSE = "https://aip.baidubce.com/rest/2.0/ocr/v1/vehicle_license";

	/**
	 *营业执照识别
	 */
	public final static String BUSINESS_LICENSE = "https://aip.baidubce.com/rest/2.0/ocr/v1/business_license";

	/**
	 *车牌识别
	 */
	public final static String LICENSE_PLATE = "https://aip.baidubce.com/rest/2.0/ocr/v1/license_plate";

	/**
	 *表格文字识别-提交请求
	 */
	public final static String FORM_OCR_REQUEST = "https://aip.baidubce.com/rest/2.0/solution/v1/form_ocr/request";

	/**
	 *表格文字识别-获取结果
	 */
	public final static String FORM_OCR_GET_REQUEST_RESULT = "https://aip.baidubce.com/rest/2.0/solution/v1/form_ocr/get_request_result";

	/**
	 *通用票据识别
	 */
	public final static String OCR_RECEIPT = "https://aip.baidubce.com/rest/2.0/ocr/v1/receipt";

	/**
	 *自定义模版文字识别
	 */
	public final static String SOLUTION_IOCR_RECOGNISE = "https://aip.baidubce.com/rest/2.0/solution/v1/iocr/recognise";

	/**
	 *人脸检测
	 */
	public final static String FACE_DETECT = "https://aip.baidubce.com/rest/2.0/face/v3/detect";

	/**
	 * 人脸对比
	 */
	public final static String FACE_MATCH = "https://aip.baidubce.com/rest/2.0/face/v3/match";

	/**
	 *人脸搜索
	 */
	public final static String FACE_SEARCH = "https://aip.baidubce.com/rest/2.0/face/v3/search";

	/**
	 *人脸库管理-人脸注册
	 */
	public final static String FACESET_USER_ADD = "https://aip.baidubce.com/rest/2.0/face/v3/faceset/user/add";

	/**
	 * 人脸库管理-人脸更新
	 */
	public final static String FACESET_USER_UPDATE = "https://aip.baidubce.com/rest/2.0/face/v3/faceset/user/update";

	/**
	 * 人脸库管理-删除用户
	 */
	public final static String FACESET_USER_DELETE = "https://aip.baidubce.com/rest/2.0/face/v3/faceset/user/delete";

	/**
	 * 人脸库管理-用户信息查询
	 */
	public final static String FACESET_USER_GET = "https://aip.baidubce.com/rest/2.0/face/v3/faceset/user/get";

	/**
	 * 人脸库管理-获取组列表
	 */
	public final static String FACESET_GROUP_GETLIST = "https://aip.baidubce.com/rest/2.0/face/v3/faceset/group/getlist";










}
