package com.jianghan.olds.controller;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jianghan.olds.entity.DataList;
import com.jianghan.olds.entity.GongTuData;
import com.jianghan.olds.service.GongTuService;

/**
 * 处理功图数据请求
 */
@Controller
public class GongTuController {
	

	
	private static final Logger logger = LoggerFactory.getLogger(GongTuController.class);
	
	@Autowired
	GongTuService  gongtuService;
	
	
	/**
	 * 访问路径 /gongtu. 请求方式 GET 请求数据格式：Accept=application/xml, application/json
	 * 返回数据结构体,将GongtuData以json或者xml的形式返回
	 * @throws NoSuchMethodException 
	 * @throws SecurityException 
	 * @ResponseBody GongtuData 
	 */
	@RequestMapping(value = "/gongtu/{name}", method = RequestMethod.GET,headers="Accept=application/xml, application/json")
	public @ResponseBody DataList<GongTuData> getGongtuData(HttpServletRequest request,@RequestBody GongTuData data ) throws SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException {
		//getClass().getClassLoader()
		
		String name = request.getParameter("name");
		String utf8Str=null;
		
		try {
			utf8Str = new  String(name.getBytes("ISO-8859-1"),"UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		String date = request.getParameter("date");
		logger.info(utf8Str);
		List<GongTuData> list = gongtuService.getGongTuDataList(utf8Str,date);
		
		DataList<GongTuData>	dataList = new DataList<GongTuData>();
		 dataList.setData(list);
		 return dataList;
		
	}
	
	

	
	
}
