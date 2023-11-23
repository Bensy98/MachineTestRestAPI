package com.demo.service;



import java.util.List;



import com.demo.entity.VerifiedLoans;



public interface IVerfiedService {

public abstract List<VerifiedLoans>findAll();

public abstract VerifiedLoans findById(int theId);

public abstract void save(VerifiedLoans theCustomerDetails);


public abstract void deleteById(int theId);



}
