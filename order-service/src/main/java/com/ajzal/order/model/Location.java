package com.ajzal.order.model;

public class Location {

	
	private String city;
	private long zipCode;
	private String street;
	
	public Location(String city, long zipCode, String street) {
		super();
		this.city = city;
		this.zipCode = zipCode;
		this.street = street;		
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getZipCode() {
		return zipCode;
	}
	public void setZipCode(long zipCode) {
		this.zipCode = zipCode;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}

	
}
