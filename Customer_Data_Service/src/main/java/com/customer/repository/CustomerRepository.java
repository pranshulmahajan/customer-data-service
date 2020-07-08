package com.customer.repository;

import org.springframework.stereotype.Repository;

import com.customer.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, Integer> 
{

}
