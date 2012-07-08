package com.jianghan.olds.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jianghan.olds.dao.gongtu.GongTuDao;
import com.jianghan.olds.entity.GongTuData;

@Service
public class GongTuServiceImpl implements GongTuService{
	
	@Autowired
	GongTuDao gongTuDao;
	/**
	* 	通过ID获取功图数据
	*/
	
	public List<GongTuData>  getGongTuDataList(String name,String date){
		
		if(name==null||date==null){
			return null;
		}
		
		List<GongTuData>  dataList =  gongTuDao.getGongtuDataList(name,date);
		//将数据sgt转化成数组形式sgtData
		if(null!=dataList){
			for(GongTuData data :dataList){
				data.createSgtData();
			}
		}
		
		return  dataList;
	};
}
