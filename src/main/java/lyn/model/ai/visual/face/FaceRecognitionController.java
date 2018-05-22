package lyn.model.ai.visual.face;

import com.alibaba.fastjson.JSON;
import com.baidu.aip.util.Base64Util;
import lyn.model.ai.util.AiConstant;
import lyn.model.ai.util.AuthService;
import lyn.model.ai.util.FileUtil;
import lyn.model.ai.util.HttpUtil;
import lyn.model.ai.visual.face.bean.FaceDetectBean;
import org.json.JSONObject;

import java.net.URLEncoder;
import java.util.HashMap;

/**
 * @Title: 人脸识别
 * @Description:
 * @Date:2018-05-22 上午 11:58
 * @author:liangyingnan
 */
public class FaceRecognitionController {


	/**
	 * 人脸检测URL
	 */
	public static String FACE_DETECT_URL="https://aip.baidubce.com/rest/2.0/face/v1/detect";

	public static void main(String[] args) throws Exception {
		String filePath ="D:/1.jpg";
		System.out.println(AiConstant.BaiDu_Access_Token);
		String result = faceDetect(filePath,"1", AiConstant.BaiDu_Access_Token);
		JSON json = JSON.parseObject(result);
		System.out.println(json.toString());
		FaceDetectBean bean = com.alibaba.fastjson.JSONObject.toJavaObject(json, FaceDetectBean.class);
		System.out.println("人脸数量:"+bean.getResult_num());
		System.out.println("美丑打分:"+bean.getResult().get(0).getBeauty());
	}
	/**
	 * 所有参数人脸检测
	 * @param filePath 图片路径数据，图片大小不超过2M。
	 * @param max_face_num 最多处理人脸数目，默认值1
	 * @param accessToken 自己应用获取的AccessToken
	 * face_fields 包括age,beauty,expression,faceshape,gender,glasses,landmark,race,qualities信息，逗号分隔，默认只返回人脸框、概率和旋转角度。
	 * @return
	 * @throws Exception
	 */
	public static String faceDetect(String filePath,String max_face_num,String accessToken) throws Exception {
		byte[] imgData = FileUtil.readFileByBytes(filePath);
		String imgStr = Base64Util.encode(imgData);
		String params = "image=" + URLEncoder.encode(imgStr,"UTF-8")+"&max_face_num="+max_face_num+"&face_fields=age,beauty,expression,faceshape,gender,glasses,landmark,race,qualities";
		String result = HttpUtil.post(FACE_DETECT_URL, accessToken, params);
		return result;
	}

}
