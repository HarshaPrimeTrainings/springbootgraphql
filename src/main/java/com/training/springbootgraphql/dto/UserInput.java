package com.training.springbootgraphql.dto;

import java.util.List;

import com.training.springbootgraphql.entity.Orders;

public class UserInput {

	private String username;
	private String contact;
	private List<Orders> orders;
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public List<Orders> getOrders() {
		return orders;
	}
	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}
	
}
