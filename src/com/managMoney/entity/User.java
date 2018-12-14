package com.managMoney.entity;


import com.managMoney.service.LoginConfirm;

public class User {
	private String phoneNum;
	private String name;
	private String password;
	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int login() {
//		System.out.println(this.phoneNum + "***" +this.password);
		return new LoginConfirm(this.phoneNum,this.password).retutnState;
	}
	
	public void register() {
	
	}
	
	public void manage() {
		
	}
	public static void main(String[] args){
	User user = new User();
	user.setPhoneNum("13577888899");
	user.setPassword("dxp123456");
	user.login();
	}
}
