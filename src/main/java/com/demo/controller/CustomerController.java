package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.CustomerDetails;

import com.demo.service.CustomerService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class CustomerController {
	
	private CustomerService customerService;
    
	@Autowired
	public CustomerController(CustomerService customerService) {
		
		this.customerService = customerService;
	}
	
	@GetMapping("/customers")
	public List<CustomerDetails>findAll(){
		return customerService.findAll();
		
	}
	

	@GetMapping("/customers/{custNo}")
	public CustomerDetails CustomerDetails(@PathVariable int custNo){
		CustomerDetails theCustomerDetails=customerService.findById(custNo);
        if(theCustomerDetails==null) {
        	throw new RuntimeException("Customer id not found-"+custNo);
        }
        return theCustomerDetails;	
}
	
	@PostMapping("/customers")
	public CustomerDetails addCustomerDetails(@RequestBody CustomerDetails theCustomerDetails){
//		theEmployee.setId(0);
		theCustomerDetails.setCustNo(0);
		customerService.save(theCustomerDetails);
		return theCustomerDetails;
		
	}
	
	
	
	@DeleteMapping("/customers/{custNo}")
	public String deleteCustomerDetails(@PathVariable int custNo){
		CustomerDetails theCustomerDetails=customerService.findById(custNo);
        if(theCustomerDetails==null) {
        	throw new RuntimeException("theCustomer id not found-"+custNo);
        }
        customerService.deleteById(custNo);
        return "Deleted customerId: "+custNo;	 
	
}

}
