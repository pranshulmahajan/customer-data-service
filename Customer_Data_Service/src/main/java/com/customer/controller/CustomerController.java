package com.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.customer.model.CustomerRequest;
import com.customer.model.CustomerResponse;
import com.customer.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerservice;

	// retrieve single customer detail from DB
	@GetMapping("/")
	@ResponseBody
	public CustomerResponse retrieveByCustomerDetailsId(@RequestBody  CustomerRequest customer) throws Exception {
		CustomerResponse customerResponse= customerservice.getByCustomerDetailsId(customer);
		return customerResponse;
	}
}
