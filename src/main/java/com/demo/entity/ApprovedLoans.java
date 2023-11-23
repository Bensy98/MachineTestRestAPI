package com.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class ApprovedLoans {
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int appNo;
	private int verId;
	
	@ManyToOne
    @JoinColumn(name = "verId", insertable=false,updatable=false)
	private VerifiedLoans verifiedLoans;

	public ApprovedLoans() {
		super();
	}

	public ApprovedLoans(int appNo, int verId, VerifiedLoans verifiedLoans) {
		super();
		this.appNo = appNo;
		this.verId = verId;
		this.verifiedLoans = verifiedLoans;
	}

	public int getAppNo() {
		return appNo;
	}

	public void setAppNo(int appNo) {
		this.appNo = appNo;
	}

	public int getVerId() {
		return verId;
	}

	public void setVerId(int verId) {
		this.verId = verId;
	}

	public VerifiedLoans getVerifiedLoans() {
		return verifiedLoans;
	}

	public void setVerifiedLoans(VerifiedLoans verifiedLoans) {
		this.verifiedLoans = verifiedLoans;
	}
	
	
	
	

}
