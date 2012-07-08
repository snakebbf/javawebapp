package com.jianghan.olds.dao.gongtu;


import java.util.List;

import com.jianghan.olds.entity.GongTuData;

public interface GongTuDao {
	
	public GongTuData getGongtuData(Integer id);
	public List<GongTuData> getGongtuDataList(String name,String date);

}
