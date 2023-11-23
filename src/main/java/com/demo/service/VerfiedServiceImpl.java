package com.demo.service;



import java.util.List;

import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;





import com.demo.entity.VerifiedLoans;

import com.demo.repository.IVerifiedRepo;



@Service

public class VerfiedServiceImpl implements IVerfiedService{



private IVerifiedRepo iVerRepo;





@Autowired

public VerfiedServiceImpl(IVerifiedRepo iVerRepo) {

super();

this.iVerRepo = iVerRepo;

}



@Override

public List<VerifiedLoans> findAll() {



return iVerRepo.findAll();

}



@Override

public VerifiedLoans findById(int theId) {

Optional<VerifiedLoans>result=iVerRepo.findById(theId);

VerifiedLoans theVerifiedLoans=null;

if(result.isPresent()) {

theVerifiedLoans=result.get();

}

else {

throw new RuntimeException("Did not find Loan Id "+theId);

}

return theVerifiedLoans;

}



@Override

public void save(VerifiedLoans theVerifiedLoans) {

iVerRepo.save(theVerifiedLoans);



}



@Override

public void deleteById(int theId) {

iVerRepo.deleteById(theId);



}





}