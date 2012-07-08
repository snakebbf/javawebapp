package com.jianghan.olds.service;

import java.util.List;

import com.jianghan.olds.entity.GongTuData;

public interface GongTuService {
	
	/**
	* 	通过ID获取功图数据
	*/
	public List<GongTuData> getGongTuDataList(String start ,String end);

}
