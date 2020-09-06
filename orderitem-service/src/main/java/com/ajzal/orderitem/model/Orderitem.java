package com.ajzal.orderitem.model;

/**
 * @author ajzal
 */
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orderitem")
public class Orderitem implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
	
}
