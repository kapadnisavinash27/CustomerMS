package com.Ashoka.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Ashoka.entity.CustomerDetails;
import com.Ashoka.service.ICustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerRestController {
	
	@Autowired
	ICustomerService customerService;

	@PostMapping("/add")
	public ResponseEntity<CustomerDetails> saveCustomer(@RequestBody 
			CustomerDetails customerdetials ){
		Integer id =customerService.saveCustomer(customerdetials);
		
		ResponseEntity re =new ResponseEntity ("Customer Details saved"+id,HttpStatus.OK);
		
		return re;
	}
}
