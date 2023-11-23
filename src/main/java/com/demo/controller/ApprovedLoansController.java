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

import com.demo.entity.ApprovedLoans;
import com.demo.entity.LoanDetails;
import com.demo.service.IApprovedLoansService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class ApprovedLoansController {

private IApprovedLoansService iApprovedLoandServ;
@Autowired
public ApprovedLoansController(IApprovedLoansService iApprovedLoandServ) {
super();
this.iApprovedLoandServ = iApprovedLoandServ;
}

@GetMapping("/approves")

public List<ApprovedLoans> findAll() {

return iApprovedLoandServ.findAll();

}

@GetMapping("/approves/{appNo}")

public ApprovedLoans getApprovedLoans(@PathVariable int appNo) {

ApprovedLoans theApprovedLoans = iApprovedLoandServ.findById(appNo);

if (theApprovedLoans == null) {

throw new RuntimeException("loan id not found-" + appNo);

}

return theApprovedLoans;

}

@PostMapping("/approves")

public ApprovedLoans addApprovedLoans(@RequestBody ApprovedLoans theApprovedLoans) {

theApprovedLoans.setAppNo(0);

iApprovedLoandServ.save(theApprovedLoans);

return theApprovedLoans;

}




@DeleteMapping("/approves/{appNo}")

public String deleteApprovedLoans(@PathVariable int appNo) {

ApprovedLoans theApprovedLoans = iApprovedLoandServ.findById(appNo);

if (theApprovedLoans == null) {

throw new RuntimeException("approved id not found-" + appNo);

}

iApprovedLoandServ.deleteById(appNo);

return "Deleted loan id: " + appNo;

}







}