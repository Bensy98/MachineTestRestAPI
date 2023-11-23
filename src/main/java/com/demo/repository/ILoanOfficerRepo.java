package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.LoanDetails;
import com.demo.entity.LoanOfficer;

public interface ILoanOfficerRepo extends JpaRepository<LoanOfficer, Integer> {

}