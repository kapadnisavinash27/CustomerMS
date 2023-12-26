package com.Ashoka.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	public ResponseEntity<String> saveCustomer(@RequestBody 
			CustomerDetails customerdetials ){
		Integer id =customerService.saveCustomer(customerdetials);
		
		return new ResponseEntity<String>("Customer Details saved"+id,HttpStatus.OK);
		}
	
	@GetMapping("/all")
	public ResponseEntity<List<CustomerDetails>> fetchAll(){
		List<CustomerDetails> customerlist=	customerService.fetchAll();
		return new ResponseEntity<List<CustomerDetails>>(customerlist,HttpStatus.OK);
	} 
	
	@GetMapping("/Single/{id}")
	public ResponseEntity<CustomerDetails> fetchone(@PathVariable Integer id){
		 CustomerDetails cd= customerService.fetchById(id);
		 return new ResponseEntity<CustomerDetails>(cd,HttpStatus.OK);
		
	} 
}
