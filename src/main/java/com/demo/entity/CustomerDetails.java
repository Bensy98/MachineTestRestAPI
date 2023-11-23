package com.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class CustomerDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int custNo;
	private String custName;
	private String custPlace;
	private long custPhone;
	private String custEmail;
	private String custPass;
	private int loanId;
	@ManyToOne
    @JoinColumn(name = "loanId", insertable=false,updatable=false)
	private LoanDetails loanDetails;
	private Long loanAmount;
	
	public CustomerDetails() {
		super();
	}

	public CustomerDetails(int custNo, String custName, String custPlace, long custPhone, String custEmail,
			String custPass, int loanId, LoanDetails loanDetails, Long loanAmount) {
		super();
		this.custNo = custNo;
		this.custName = custName;
		this.custPlace = custPlace;
		this.custPhone = custPhone;
		this.custEmail = custEmail;
		this.custPass = custPass;
		this.loanId = loanId;
		this.loanDetails = loanDetails;
		this.loanAmount = loanAmount;
	}

	public int getCustNo() {
		return custNo;
	}

	public void setCustNo(int custNo) {
		this.custNo = custNo;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustPlace() {
		return custPlace;
	}

	public void setCustPlace(String custPlace) {
		this.custPlace = custPlace;
	}

	public long getCustPhone() {
		return custPhone;
	}

	public void setCustPhone(long custPhone) {
		this.custPhone = custPhone;
	}

	public String getCustEmail() {
		return custEmail;
	}

	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}

	public String getCustPass() {
		return custPass;
	}

	public void setCustPass(String custPass) {
		this.custPass = custPass;
	}

	public int getLoanId() {
		return loanId;
	}

	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}

	public LoanDetails getLoanDetails() {
		return loanDetails;
	}

	public void setLoanDetails(LoanDetails loanDetails) {
		this.loanDetails = loanDetails;
	}

	public Long getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(Long loanAmount) {
		this.loanAmount = loanAmount;
	}
	
	
	

}
