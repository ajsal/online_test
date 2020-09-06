package com.ajzal.order.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="t_order")
public class Order  implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	
	private String customername;
	
	private Date orderdate;
	
	private String shippingaddress;
	
	private BigDecimal total;
	
	private transient List<Orderitem> ordertems;

	public Order() {
		super();
	}

	public Order(long id, String customername, Date orderdate, String shippingaddress, BigDecimal total) {
		super();
		Id = id;
		this.customername = customername;
		this.orderdate = orderdate;
		this.shippingaddress = shippingaddress;
		this.total = total;
	}
	
	public Order(long id, String customername, Date orderdate, String shippingaddress, BigDecimal total, List<Orderitem> ordertems) {
		super();
		Id = id;
		this.customername = customername;
		this.orderdate = orderdate;
		this.shippingaddress = shippingaddress;
		this.total = total;
		this.ordertems = ordertems;
	}
	

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public Date getOrderdate() {
		return orderdate;
	}

	public void setOrderdate(Date orderdate) {
		this.orderdate = orderdate;
	}

	public String getShippingaddress() {
		return shippingaddress;
	}

	public void setShippingaddress(String shippingaddress) {
		this.shippingaddress = shippingaddress;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public List<Orderitem> getOrdertems() {
		return ordertems;
	}

	public void setOrdertems(List<Orderitem> ordertems) {
		this.ordertems = ordertems;
	}

	@Override
	public String toString() {
		return "Order [Id=" + Id + ", customername=" + customername + ", orderdate=" + orderdate + ", shippingaddress="
				+ shippingaddress + ", total=" + total + ", ordertems=" + ordertems + "]";
	}


	
}
