package com.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.ApprovedLoans;
import com.demo.entity.LoanDetails;
import com.demo.repository.IApprovedLoansRepo;

@Service
public class ApprovedLoansServImpl implements IApprovedLoansService {

IApprovedLoansRepo iApprovedLoansRepo;
@Autowired
public ApprovedLoansServImpl(IApprovedLoansRepo iApprovedLoansRepo) {
super();
this.iApprovedLoansRepo = iApprovedLoansRepo;
}
@Override
public List<ApprovedLoans> findAll() {
return iApprovedLoansRepo.findAll();
}
@Override
public ApprovedLoans findById(int theId) {
Optional<ApprovedLoans>result=iApprovedLoansRepo.findById(theId);

ApprovedLoans theApprovedLoans=null;

if(result.isPresent()) {

theApprovedLoans=result.get();

}

else {

throw new RuntimeException("Did not find approved number  "+theId);

}

return theApprovedLoans;

}

@Override
public void save(ApprovedLoans theApprovedLoans) {
iApprovedLoansRepo.save(theApprovedLoans);


}
@Override
public void deleteById(int theId) {
iApprovedLoansRepo.deleteById(theId);

}


}