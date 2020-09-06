package com.ajzal.order.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orderitem")
public class Orderitem {
	
	@Id
	@GeneratedValue
	private long id;	
	
	private String productcode;
	
	
	private String productname;
	
	
	private long quantity;
	
	
	private long orderid;
	
	
	public Orderitem() {
		super();
	}


	public Orderitem(long id, String productcode, String productname, long quantity, long orderid) {
		super();
		this.id = id;
		this.productcode = productcode;
		this.productname = productname;
		this.quantity = quantity;
		this.orderid = orderid;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getProductcode() {
		return productcode;
	}


	public void setProductcode(String productcode) {
		this.productcode = productcode;
	}


	public String getProductname() {
		return productname;
	}


	public void setProductname(String productname) {
		this.productname = productname;
	}


	public long getQuantity() {
		return quantity;
	}


	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}


	public long getOrderid() {
		return orderid;
	}


	public void setOrderid(long orderid) {
		this.orderid = orderid;
	}


	@Override
	public String toString() {
		return "Orderitem [id=" + id + ", productcode=" + productcode + ", productname=" + productname + ", quantity="
				+ quantity + ", orderid=" + orderid + "]";
	}
	
	
}
