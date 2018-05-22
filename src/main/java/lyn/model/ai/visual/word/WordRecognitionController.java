package lyn.model.ai.visual.word;

import com.alibaba.fastjson.JSON;
import com.baidu.aip.ocr.AipOcr;
import lyn.model.ai.util.AiConstant;
import lyn.model.ai.visual.word.bean.AipQcrSingleton;
import lyn.model.ai.visual.word.bean.BaiDuOCRBean;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.List;

/**
 * @Title: 文字识别控制器
 * @Description:
 * @Date:2018-05-22 上午 11:56
 * @author:liangyingnan
 */
public class WordRecognitionController {


	/**
	 * 读取图片中的文字
	 * @return
	 */
	public static List readImgWord(String path){
		AipOcr aipOcr = AipQcrSingleton.getInstance();
		HashMap<String, String> options= new HashMap<String, String>();
		JSONObject jsonObject = aipOcr.basicGeneral(path ,options);
		System.out.println(jsonObject);
		BaiDuOCRBean baiDuOCRBean = com.alibaba.fastjson.JSONObject.toJavaObject(JSON.parseObject(jsonObject.toString()), BaiDuOCRBean.class);
		List<BaiDuOCRBean.Words_result> list = baiDuOCRBean.getWords_result();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getWords());
		}
		return list;
	}


	public static void main(String[] args) {
		List a = readImgWord("D:/7.jpg");
	}




}
