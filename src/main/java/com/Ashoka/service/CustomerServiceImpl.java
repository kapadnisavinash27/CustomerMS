package com.Ashoka.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ashoka.Repository.CustomerRepository;
import com.Ashoka.entity.CustomerDetails;

@Service
public class CustomerServiceImpl<T> implements ICustomerService {

	@Autowired
	private CustomerRepository crepo;

	
	public Integer saveCustomer(CustomerDetails customerdetails) {
		
	customerdetails=crepo.save(customerdetails);
	return customerdetails.getCid();
	}


	
	public List<CustomerDetails> fetchAll() {
		
		List <CustomerDetails> customerlist= crepo.findAll();
		return customerlist;
	}



	@Override
	public CustomerDetails fetchById(Integer id) {
		
	Optional<CustomerDetails> cd =crepo.findById(id);
	if(cd.isPresent()) { return cd.get();}
	else {return null;}
	
	}
	
	
}
