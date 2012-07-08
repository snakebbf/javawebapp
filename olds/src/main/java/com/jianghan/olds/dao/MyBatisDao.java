package com.jianghan.olds.dao;

import java.io.Serializable;
import java.util.List;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;
/**
 * <p>Title: MyBatisDAO类</p>
 * <p>Description: 传入sqlKey和参数，返回相应执行结果</p>
 * @author 906237 
 * @version 1.0
 */
@Repository
public class MyBatisDao extends SqlSessionDaoSupport {
	
	
	/**
	 * 插入一条记录
	 * @param sqlkey 、记录对象
	 */
	protected int insert(String key, Object obj) {
		 return getSqlSession().insert(key, obj);
	}

	/**
	 * 更新一条记录
	 * @param sqlkey 、记录对象
	 */
	protected int update(String key, Object obj) {
		return getSqlSession().update(key, obj);
	}

	/**
	 * 删除一条记录
	 * @param sqlkey 、记录id
	 */
	protected int delete(String key, Serializable id) {
		return getSqlSession().delete(key, id);
	}

	/**
	 * 删除一条记录
	 * @param sqlkey 、记录对象
	 */
	protected int delete(String key, Object obj) {
		return getSqlSession().delete(key, obj);
	}

	/**
	 * 查询一条记录
	 * @param sqlkey 、插入对象
	 */
	@SuppressWarnings("unchecked")
	protected <T> T get(String key, Object params) {
		
		return (T) getSqlSession().selectOne(key, params);
	}

	/**
	 * 查询全部记录
	 * @param sqlkey 
	 */
	@SuppressWarnings("unchecked")
	protected <T> List<T> getList(String key) {
		return (List<T>)getSqlSession().selectList(key);
	}

	/**
	 * 查询满足条件的全部记录
	 * @param sqlkey 、查询条件
	 */
	@SuppressWarnings("unchecked")
	protected <T> List<T> getList(String key, Object params) {
		return (List<T>)getSqlSession().selectList(key, params);
	}


}
