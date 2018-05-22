package lyn.model.ai.visual.word.bean;

import com.baidu.aip.ocr.AipOcr;
import groovy.lang.Singleton;
import lyn.model.ai.util.AiConstant;

/**
 * @Title: 单例创建AipQcr对象
 * @Description:
 * @Date:2018-05-22 下午 14:29
 * @author:liangyingnan
 */
public class AipQcrSingleton {

	/*****************************懒汉式**********************************/
//	private static AipOcr aipOcr = null;

	/**
	 *  1在getInstance方法上加同步
	 * @return
	 *//*
	public static  synchronized  AipOcr getInstanceSync() {
		if(null ==aipOcr){
			aipOcr = new AipOcr(AiConstant.BaiDu_App_Id,AiConstant.BaiDu_API_Key,AiConstant.BaiDu_Secret_Key);
		}
		return aipOcr;
	}

	*//**
	 * 2双重检查锁定
	 * @return
	 *//*
	public static AipOcr getInstance() {
		if (aipOcr == null) {
			synchronized (AipOcr.class) {
				if (aipOcr == null) {
					aipOcr = new AipOcr(AiConstant.BaiDu_App_Id,AiConstant.BaiDu_API_Key,AiConstant.BaiDu_Secret_Key);
				}
			}
		}
		return aipOcr;
	}

	*//**
	 * 3静态内部类
	 *//*
	private static class LazyHolder {
		private static final AipOcr aipOcr = new AipOcr(AiConstant.BaiDu_App_Id,AiConstant.BaiDu_API_Key,AiConstant.BaiDu_Secret_Key);
	}

	public static final AipOcr getInstanceLazy() {
		return LazyHolder.aipOcr;
	}*/

	/********************************饿汉式***********************************/

	private static final AipOcr aipOcr = new AipOcr(AiConstant.BAIDU_APP_ID,AiConstant.BAIDU_API_KEY,AiConstant.BAIDU_SECRET_KEY);

	public static AipOcr getInstance() {
		return aipOcr;
	}

	private AipQcrSingleton (){
	}

}
