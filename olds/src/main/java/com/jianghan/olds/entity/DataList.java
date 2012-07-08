package com.jianghan.olds.entity;

import java.util.List;

public class DataList<T> {
	private boolean suc;
	private String msg;
	private List<T> data;
	
	public boolean isSuc() {
		return suc;
	}
	public void setSuc(boolean suc) {
		this.suc = suc;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public List<T> getData() {
		return data;
	}
	public void setData(List<T> data) {
		this.data = data;
	}
	

}
