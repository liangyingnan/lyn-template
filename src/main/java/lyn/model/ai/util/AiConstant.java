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

	/**
	 * 人脸库管理-获取用户列表
	 */
	public final static String FACESET_GROUP_GETUSERS = "https://aip.baidubce.com/rest/2.0/face/v3/faceset/group/getusers";

	/**
	 * 人脸库管理-复制用户
	 */
	public final static String FACESET_USER_COPY = "https://aip.baidubce.com/rest/2.0/face/v3/faceset/user/copy";

	/**
	 * 人脸库管理-获取用户人脸列表
	 */
	public final static String FACESET_FACE_GETLIST = "https://aip.baidubce.com/rest/2.0/face/v3/faceset/face/getlist";

	/**
	 * 人脸库管理-创建用户组
	 */
	public final static String FACESET_GROUP_ADD = "https://aip.baidubce.com/rest/2.0/face/v3/faceset/group/add";

	/**
	 *人脸库管理-删除用户组
	 */
	public final static String FACESET_GROUP_DELETE = "https://aip.baidubce.com/rest/2.0/face/v3/faceset/group/delete";

	/**
	 *人脸库管理-删除人脸
	 */
	public final static String FACESET_FACE_DELETE = "https://aip.baidubce.com/rest/2.0/face/v3/faceset/face/delete";

	/**
	 * 在线活体检测
	 */
	public final static String FACEVERIFY = "https://aip.baidubce.com/rest/2.0/face/v3/faceverify";

	/**
	 * 中文词向量表示
	 */
	public final static String WORD_EMB_VEC = "https://aip.baidubce.com/rpc/2.0/nlp/v2/word_emb_vec";

	/**
	 * 词义相似度
	 */
	public final static String WORD_EMB_SIM = "https://aip.baidubce.com/rpc/2.0/nlp/v2/word_emb_sim";

	/**
	 * 短文本相似度
	 */
	public final static String SIMNET = "https://aip.baidubce.com/rpc/2.0/nlp/v2/simnet";

	/**
	 * 中文DNN语言模型
	 */
	public final static String DNNLM_CN = "https://aip.baidubce.com/rpc/2.0/nlp/v2/dnnlm_cn";

	/**
	 * 评论观点抽取
	 */
	public final static String COMMENT_TAG = "https://aip.baidubce.com/rpc/2.0/nlp/v2/comment_tag";

	/**
	 * 情感倾向分析
	 */
	public final static String SENTIMENT_CLASSIFY = "https://aip.baidubce.com/rpc/2.0/nlp/v1/sentiment_classify";

	/**
	 * 文章分类
	 */
	public final static String TOPIC = "https://aip.baidubce.com/rpc/2.0/nlp/v1/topic";

	/**
	 * 文章标签
	 */
	public final static String KEYWORD = "https://aip.baidubce.com/rpc/2.0/nlp/v1/keyword";

	/**
	 * 依存句法分析
	 */
	public final static String DEPPARSER = "https://aip.baidubce.com/rpc/2.0/nlp/v1/depparser";

	/**
	 * 词法分析
	 */
	public final static String LEXER = "https://aip.baidubce.com/rpc/2.0/nlp/v1/lexer";

	/**
	 * 词法分析（定制）
	 */
	public final static String LEXER_CUSTOM = "https://aip.baidubce.com/rpc/2.0/nlp/v1/lexer_custom";

	/**
	 * 文本审核
	 */
	public final static String ANTISPAM_SPAM = "https://aip.baidubce.com/rest/2.0/antispam/v2/spam";

	/**
	 * 色情识别
	 */
	public final static String ANTIPORN_DETECT = "https://aip.baidubce.com/rest/2.0/antiporn/v1/detect";

	/**
	 * GIF色情图像识别
	 */
	public final static String ANTIPORN_DETECT_GIF = "https://aip.baidubce.com/rest/2.0/antiporn/v1/detect_gif";

	/**
	 * 暴恐识别
	 */
	public final static String ANTITERROR_DETECT = "https://aip.baidubce.com/rest/2.0/antiterror/v1/detect";

	/**
	 * 政治敏感识别
	 */
	public final static String SOLUTION_DIRECT_IMG_CENSOR = "https://aip.baidubce.com/api/v1/solution/direct/img_censor";

	/**
	 * 广告检测
	 */
	public final static String SOLUTION_DIRECT_IMG_CENSOR1 = "https://aip.baidubce.com/api/v1/solution/direct/img_censor";

	/**
	 * 恶心图像识别
	 */
	public final static String SOLUTION_DIRECT_IMG_CENSOR2 = "https://aip.baidubce.com/api/v1/solution/direct/img_censor";

	/**
	 * 图像质量检测
	 */
	public final static String SOLUTION_DIRECT_IMG_CENSOR3 = "https://aip.baidubce.com/api/v1/solution/direct/img_censor";

	/**
	 * 头像审核
	 */
	public final static String SOLUTION_FACE_AUDIT = "https://aip.baidubce.com/rest/2.0/solution/v1/face_audit";

	/**
	 * 图像审核
	 */
	public final static String SOLUTION_IMG_CENSOR_USER_DEFINED = "https://aip.baidubce.com/rest/2.0/solution/v1/img_censor/user_defined";

	/**
	 * 理解与交互技术UNIT
	 */
	public final static String SOLUTION_UNIT_UTTERANCE = "https://aip.baidubce.com/rpc/2.0/solution/v1/unit_utterance";

	/**
	 * 实体标注
	 */
	public final static String COGNITIVE_ENTITY_ANNOTATION = "https://aip.baidubce.com/rpc/2.0/kg/v1/cognitive/entity_annotation";

	/**
	 * 通用物体和场景识别高级版
	 */
	public final static String IMAGE_CLASSIFY_ADVANCED_GENERAL = "https://aip.baidubce.com/rest/2.0/image-classify/v2/advanced_general";

	/**
	 * 图像主体检测
	 */
	public final static String IMAGE_CLASSIFY_OBJECT_DETECT = "https://aip.baidubce.com/rest/2.0/image-classify/v1/object_detect";

	/**
	 * 菜品识别
	 */
	public final static String IMAGE_CLASSIFY_DISH = "https://aip.baidubce.com/rest/2.0/image-classify/v2/dish";

	/**
	 * 车型识别
	 */
	public final static String IMAGE_CLASSIFY_CAR = "https://aip.baidubce.com/rest/2.0/image-classify/v1/car";

	/**
	 * 动物识别
	 */
	public final static String IMAGE_CLASSIFY_ANIMAL = "https://aip.baidubce.com/rest/2.0/image-classify/v1/animal";

	/**
	 * 植物识别
	 */
	public final static String IMAGE_CLASSIFY_PLANT = "https://aip.baidubce.com/rest/2.0/image-classify/v1/plant";

	/**
	 * 人体关键点识别
	 */
	public final static String IMAGE_CLASSIFY_BODY_ANALYSIS = "https://aip.baidubce.com/rest/2.0/image-classify/v1/body_analysis";

	/**
	 * 人体属性识别
	 */
	public final static String IMAGE_CLASSIFY_BODY_ATTR = "https://aip.baidubce.com/rest/2.0/image-classify/v1/body_attr";

	/**
	 * 人流统计
	 */
	public final static String IMAGE_CLASSIFY_BODY_NUM = "https://aip.baidubce.com/rest/2.0/image-classify/v1/body_num";

}
