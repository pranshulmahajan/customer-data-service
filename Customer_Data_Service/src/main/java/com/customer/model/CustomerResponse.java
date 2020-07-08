package com.customer.model;

public class CustomerResponse {
	
	private long id;
	private int cust_id;
	private String title;
	private String first_name;
	private String last_name;
	private ProductData product_data;
	private Address addresses;
	
	
	
	public CustomerResponse(long id, int cust_id, String title, String first_name, String last_name,
			ProductData product_data, Address addresses) {
		super();
		this.id = id;
		this.cust_id = cust_id;
		this.title = title;
		this.first_name = first_name;
		this.last_name = last_name;
		this.product_data = product_data;
		this.addresses = addresses;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getCust_id() {
		return cust_id;
	}
	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public ProductData getProduct_data() {
		return product_data;
	}
	public void setProduct_data(ProductData product_data) {
		this.product_data = product_data;
	}
	public Address getAddresses() {
		return addresses;
	}
	public void setAddresses(Address addresses) {
		this.addresses = addresses;
	}
	@Override
	public String toString() {
		return "CustomerResponse [id=" + id + ", cust_id=" + cust_id + ", title=" + title + ", first_name=" + first_name
				+ ", last_name=" + last_name + ", product_data=" + product_data + ", addresses=" + addresses + "]";
	}
	
	

}

