package com.demo.service;



import java.util.List;

import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;





import com.demo.entity.LoanDetails;

import com.demo.repository.ILoanDetails;



@Service

public class LoanServiceImpl implements ILoanService{

	private ILoanDetails iLoanRepo;

	



	@Autowired

	public LoanServiceImpl(ILoanDetails iLoanRepo) {

		super();

		this.iLoanRepo = iLoanRepo;

	}

	@Override

	public List<LoanDetails> findAll() {

		

		return iLoanRepo.findAll();

	}



	@Override

	public LoanDetails findById(int theId) {

		Optional<LoanDetails>result=iLoanRepo.findById(theId);

		LoanDetails theLoanDetails=null;

		if(result.isPresent()) {

			theLoanDetails=result.get();

		}

		else {

			throw new RuntimeException("Did not find Loan Id "+theId);

		}

		return theLoanDetails;

	}



	@Override

	public void save(LoanDetails theLoanDetails) {

		iLoanRepo.save(theLoanDetails);

		

	}



	@Override

	public void deleteById(int theId) {

		iLoanRepo.deleteById(theId);

		

	}





}