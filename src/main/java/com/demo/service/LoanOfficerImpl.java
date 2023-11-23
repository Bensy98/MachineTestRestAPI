package com.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.LoanDetails;
import com.demo.entity.LoanOfficer;
import com.demo.repository.ILoanOfficerRepo;

@Service
public class LoanOfficerImpl implements ILoanOfficerService{

ILoanOfficerRepo iLoanOfficerRepo;
@Autowired
public LoanOfficerImpl(ILoanOfficerRepo iLoanOfficerRepo) {
super();
this.iLoanOfficerRepo = iLoanOfficerRepo;
}
@Override
public List<LoanOfficer> findAll() {
return iLoanOfficerRepo.findAll();
}
@Override
public LoanOfficer findById(int theId) {
Optional<LoanOfficer>result=iLoanOfficerRepo.findById(theId);

LoanOfficer theLoanOfficer=null;

if(result.isPresent()) {

theLoanOfficer=result.get();

}

else {

throw new RuntimeException("Did not find ref Id "+theId);

}

return theLoanOfficer;

}
@Override
public void save(LoanOfficer theLoanOfficer) {
iLoanOfficerRepo.save(theLoanOfficer);

}
@Override
public void deleteById(int theId) {
iLoanOfficerRepo.deleteById(theId);
}





}