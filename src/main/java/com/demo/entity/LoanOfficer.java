package com.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class LoanOfficer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int refNo;
	private int custNo;
	
	@ManyToOne
    @JoinColumn(name = "custNo", insertable=false,updatable=false)
	private CustomerDetails customerDetails;

	public LoanOfficer(int refNo, int custNo, CustomerDetails customerDetails) {
		super();
		this.refNo = refNo;
		this.custNo = custNo;
		this.customerDetails = customerDetails;
	}

	public LoanOfficer() {
		super();
	}

	public int getRefNo() {
		return refNo;
	}

	public void setRefNo(int refNo) {
		this.refNo = refNo;
	}

	public int getCustNo() {
		return custNo;
	}

	public void setCustNo(int custNo) {
		this.custNo = custNo;
	}

	public CustomerDetails getCustomerDetails() {
		return customerDetails;
	}

	public void setCustomerDetails(CustomerDetails customerDetails) {
		this.customerDetails = customerDetails;
	}
	
	

}
