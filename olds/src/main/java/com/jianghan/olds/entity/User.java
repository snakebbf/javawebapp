package com.jianghan.olds.entity;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="User") //需要声明xml根路径名称
public class User {
	private String userName="31231231"; //4

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
}
