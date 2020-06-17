package com.customer.service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.customer.model.Customer;
import com.customer.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	public List<Customer> getAll(){
		return  customerRepository.findAll();
	}

	public Customer getByCustomerId(int customerId) {
		return customerRepository.getByCustomerId(customerId);
	}

}
