package com.capgemini.cabs.bean;

import java.util.Date;

public class CabRequest {

	public int request_id;
	private Date date_of_request;
	private String request_status;
	private String cab_number;

	private String customer_name;
	private String address_of_pickup;
	private String phone_number;
	private String pincode;

	public int getRequest_id() {
		return request_id;
	}

	public void setRequest_id(int request_id) {
		this.request_id = request_id;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public Date getDate_of_request() {
		return date_of_request;
	}

	public void setDate_of_request(Date date_of_request) {
		this.date_of_request = date_of_request;
	}

	public String getRequest_status() {
		return request_status;
	}

	public void setRequest_status(String request_status) {
		this.request_status = request_status;
	}

	public String getCab_number() {
		return cab_number;
	}

	public void setCab_number(String cab_number) {
		this.cab_number = cab_number;
	}

	public String getAddress_of_pickup() {
		return address_of_pickup;
	}

	public void setAddress_of_pickup(String address_of_pickup) {
		this.address_of_pickup = address_of_pickup;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "CabRequest [request_id=" + request_id + ", customer_name="
				+ customer_name + ", phone_number=" + phone_number
				+ ", date_of_request=" + date_of_request + ", request_status="
				+ request_status + ", cab_number=" + cab_number
				+ ", address_of_pickup=" + address_of_pickup + ", pincode="
				+ pincode + "]";
	}

}
