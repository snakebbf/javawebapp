package com.jianghan.olds.dao.gongtu;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.jianghan.olds.dao.MyBatisDao;
import com.jianghan.olds.entity.GongTuData;


public class GongTuDaoImpl extends MyBatisDao implements GongTuDao {
	
	public GongTuData getGongtuData(Integer id){
		return (GongTuData) get("getGongtuDataByID", id);
	};

	public List<GongTuData> getGongtuDataList(String name,String date){
		Map dateParams = new HashMap();
		dateParams.put("name", name);
		dateParams.put("date", date);
		return getList("getGongtuDataByTimeRange", dateParams);
	};

}
