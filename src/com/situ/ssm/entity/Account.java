package com.situ.ssm.entity;

public class Account {
	private Integer id;
	private Integer money;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getMoney() {
		return money;
	}
	public void setMoney(Integer money) {
		this.money = money;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", money=" + money + "]";
	}
	
	
}
