package com.training.springbootgraphql.dto;

import java.util.List;

import com.training.springbootgraphql.entity.Orders;


public class OrdersInput {
	
	private String ordertype;
	private String orderstatus;
	public String getOrdertype() {
		return ordertype;
	}
	public void setOrdertype(String ordertype) {
		this.ordertype = ordertype;
	}
	public String getOrderstatus() {
		return orderstatus;
	}
	public void setOrderstatus(String orderstatus) {
		this.orderstatus = orderstatus;
	}
	
	
	
	
}
