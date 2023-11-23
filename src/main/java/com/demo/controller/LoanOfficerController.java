package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.LoanDetails;
import com.demo.entity.LoanOfficer;
import com.demo.service.ILoanOfficerService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class LoanOfficerController {

private ILoanOfficerService iLoanOfficerServ;
@Autowired
public LoanOfficerController(ILoanOfficerService iLoanOfficerServ) {
super();
this.iLoanOfficerServ = iLoanOfficerServ;
}

@GetMapping("/loanofficers")

public List<LoanOfficer> findAll() {

return iLoanOfficerServ.findAll();

}

@GetMapping("/loanofficers/{refId}")

public LoanOfficer getLoanOfficer(@PathVariable int refId) {

LoanOfficer theLoanOfficer= iLoanOfficerServ.findById(refId);

if (theLoanOfficer == null) {

throw new RuntimeException("loan id not found-" + refId);

}

return theLoanOfficer;

}

@PostMapping("/loanofficers")

public LoanOfficer addLoanOfficer(@RequestBody LoanOfficer theLoanOfficer) {

theLoanOfficer.setRefNo(0);

iLoanOfficerServ.save(theLoanOfficer);

return theLoanOfficer;

}




@DeleteMapping("/loanofficers/{refId}")

public String deleteLoanOfficer(@PathVariable int refId) {

LoanOfficer theLoanOfficer = iLoanOfficerServ.findById(refId);

if (theLoanOfficer == null) {

throw new RuntimeException("ref id not found-" + refId);

}

iLoanOfficerServ.deleteById(refId);

return "Deleted ref id: " + refId;

}






}