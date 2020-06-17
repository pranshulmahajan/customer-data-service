package com.customer.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.customer.model.Customer;
import com.customer.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerservice;

	// retrieve all customer details from db
	@GetMapping("/getAll")
	public List<Customer> retrieveCustomerDetails(){
		return customerservice.getAll();		
	}

	// retrieve single customer detail from db
	@GetMapping("/get")
	public Customer retrieveByCustomerId(@RequestParam Integer customerId) {
		return customerservice.getByCustomerId(customerId);
	}
}
