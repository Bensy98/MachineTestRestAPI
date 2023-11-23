package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.ApprovedLoans;
import com.demo.entity.LoanDetails;

public interface IApprovedLoansRepo extends JpaRepository<ApprovedLoans, Integer>  {

}