package com.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class LoanDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int loanId;
	private String loanName;
	
	public LoanDetails() {
		super();
	}

	public LoanDetails(int loanId, String loanName) {
		super();
		this.loanId = loanId;
		this.loanName = loanName;
	}

	public int getLoanId() {
		return loanId;
	}

	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}

	public String getLoanName() {
		return loanName;
	}

	public void setLoanName(String loanName) {
		this.loanName = loanName;
	}
	
	

}
