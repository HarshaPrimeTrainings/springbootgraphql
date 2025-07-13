package com.training.springbootgraphql.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Orders {
	
	
	public Orders() {
		
	}
	
	
	public Orders(String ordertype, String orderstatus) {
		super();
		this.ordertype = ordertype;
		this.orderstatus = orderstatus;
	}


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer oid;
	private String ordertype;
	private String orderstatus;
	
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	private User user;
	
	
	public Integer getOid() {
		return oid;
	}
	public void setOid(Integer oid) {
		this.oid = oid;
	}
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
