package com.customer.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "customer")
public class Customer {
	
	@Id
	private int customerId;
	private String customerName;
	private int accountId;
	private String customerAddress;
	

	
	public Customer(int customerId, String customerName, int accountId, String customerAddress) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.accountId = accountId;
		this.customerAddress = customerAddress;
	}
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", accountId=" + accountId
				+ ", customerAddress=" + customerAddress + "]";
	}
	
	
	

}
