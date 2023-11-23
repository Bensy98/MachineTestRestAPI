package com.demo.service;

import java.util.List;

import com.demo.entity.LoanDetails;
import com.demo.entity.LoanOfficer;

public interface ILoanOfficerService {

public abstract List<LoanOfficer>findAll();

public abstract LoanOfficer findById(int theId);

public abstract void save(LoanOfficer theLoanOfficer);

public abstract void deleteById(int theId);

}