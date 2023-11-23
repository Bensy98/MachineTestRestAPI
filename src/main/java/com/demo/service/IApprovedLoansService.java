package com.demo.service;

import java.util.List;

import com.demo.entity.ApprovedLoans;
import com.demo.entity.LoanDetails;

public interface IApprovedLoansService {


public abstract List<ApprovedLoans>findAll();

public abstract ApprovedLoans findById(int theId);

public abstract void save(ApprovedLoans theApprovedLoans);

public abstract void deleteById(int theId);


}