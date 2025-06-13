package com.tap.pojo;

public class Address {
	private int houseNum;
	private String street;
	private String city;
	private String state;
	private String country;
	public Address() {
		super();
	}
	public Address(int houseNum, String street, String city, String state, String country) {
		super();
		this.houseNum = houseNum;
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
	}
	public int getHouseNum() {
		return houseNum;
	}
	public void setHouseNum(int houseNum) {
		this.houseNum = houseNum;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [houseNum=" + houseNum + ", street=" + street + ", city=" + city + ", state=" + state
				+ ", country=" + country + "]";
	}
	// Other getters and setters can be added as needed
}
