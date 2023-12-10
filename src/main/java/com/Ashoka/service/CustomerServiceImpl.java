package com.Ashoka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ashoka.Repository.CustomerRepository;
import com.Ashoka.entity.CustomerDetails;

@Service
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	private CustomerRepository crepo;

	
	public Integer saveCustomer(CustomerDetails customerdetails) {
		
	customerdetails=crepo.save(customerdetails);
	return customerdetails.getCid();
	}
}
