package com.demo.service;

import java.util.List;

import com.demo.entity.CustomerDetails;

public interface CustomerService {
	
	public abstract List<CustomerDetails>findAll();
	public abstract CustomerDetails findById(int theId);
	public abstract void save(CustomerDetails theCustomerDetails);
	public abstract void deleteById(int theId);

}
