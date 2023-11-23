package com.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.demo.entity.CustomerDetails;

import com.demo.repository.CustomerRepository;
@Service
public class CustomerServiceImpl implements CustomerService{
	
	private CustomerRepository customerRepository;
	
	

	public CustomerServiceImpl(CustomerRepository customerRepository) {
		super();
		this.customerRepository = customerRepository;
	}



	@Override
	public List<CustomerDetails> findAll() {
		
		return customerRepository.findAll();
	}



	@Override
	public CustomerDetails findById(int theId) {
		Optional<CustomerDetails>result=customerRepository.findById(theId);
		CustomerDetails theCustomerDetails=null;
		if(result.isPresent()) {
			theCustomerDetails=result.get();
		}
		else {
			throw new RuntimeException("Did not find customer Id "+theId);
		}
		return theCustomerDetails;
	
		
	}



	@Override
	public void save(CustomerDetails theCustomerDetails) {
		
		customerRepository.save(theCustomerDetails);
		
	}



	@Override
	public void deleteById(int theId) {
		
		customerRepository.deleteById(theId);
		
	}

	

}
