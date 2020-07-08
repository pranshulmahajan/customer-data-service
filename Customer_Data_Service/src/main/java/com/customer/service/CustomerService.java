package com.customer.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.customer.model.Customer;
import com.customer.model.CustomerRequest;
import com.customer.model.CustomerResponse;
import com.customer.repository.CustomerRepository;

@Service
public class CustomerService  {

	@Autowired
	private CustomerRepository customerRepository;

	public CustomerResponse getByCustomerDetailsId(CustomerRequest cust) {
		Optional<Customer> optional= customerRepository.findById((cust.getParty_id()));
		CustomerResponse customerResponse=null;
		if (optional.isPresent()) { 
			customerResponse= new CustomerResponse(createRandomId(),optional.get().getCust_id(),optional.get().getTitle(),optional.get().getFirst_name(),optional.get().getLast_name(),optional.get().getProduct_data(),optional.get().getAddresses());  
		} 
		return customerResponse;
	}

	private static long createRandomId(){    
		return (long)(Math.random()*100000 + 3333300000L);
	}
}
