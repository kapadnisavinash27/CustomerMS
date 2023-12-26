package com.Ashoka.service;

import java.util.List;

import com.Ashoka.entity.CustomerDetails;

public interface ICustomerService {

	public Integer saveCustomer(CustomerDetails customerdetails);
	
	public List<CustomerDetails> fetchAll();

	public CustomerDetails fetchById(Integer id);

	

}
