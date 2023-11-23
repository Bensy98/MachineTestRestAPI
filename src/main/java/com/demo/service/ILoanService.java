package com.demo.service;



import java.util.List;



import com.demo.entity.LoanDetails;



public interface ILoanService {

	public abstract List<LoanDetails>findAll();

	public abstract LoanDetails findById(int theId);

	public abstract void save(LoanDetails theLoanDetails);

	public abstract void deleteById(int theId);



}