package com.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class VerifiedLoans {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int verId;
	private int refNo;
	
	@ManyToOne
    @JoinColumn(name = "refNo", insertable=false,updatable=false)
	private LoanOfficer loanOfficer;

	public VerifiedLoans() {
		super();
	}

	public VerifiedLoans(int verId, int refNo, LoanOfficer loanOfficer) {
		super();
		this.verId = verId;
		this.refNo = refNo;
		this.loanOfficer = loanOfficer;
	}

	public int getVerId() {
		return verId;
	}

	public void setVerId(int verId) {
		this.verId = verId;
	}

	public int getRefNo() {
		return refNo;
	}

	public void setRefNo(int refNo) {
		this.refNo = refNo;
	}

	public LoanOfficer getLoanOfficer() {
		return loanOfficer;
	}

	public void setLoanOfficer(LoanOfficer loanOfficer) {
		this.loanOfficer = loanOfficer;
	}
	
	
	

}
