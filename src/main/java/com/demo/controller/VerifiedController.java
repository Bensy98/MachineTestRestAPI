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



import com.demo.entity.VerifiedLoans;

import com.demo.service.IVerfiedService;



@CrossOrigin

@RestController

@RequestMapping("/api")

public class VerifiedController {



private IVerfiedService iVerServ;



@Autowired

public VerifiedController(IVerfiedService iVerServ) {

super();

this.iVerServ = iVerServ;

}



@GetMapping("/verifies")

public List<VerifiedLoans>findAll(){

return iVerServ.findAll();

}



@GetMapping("/verifies/{verId}")

public VerifiedLoans getVerified(@PathVariable int verId){

VerifiedLoans theVerifiedLoans=iVerServ.findById(verId);

        if(theVerifiedLoans==null) {

        throw new RuntimeException("Loan id not found-"+verId);

        }

        return theVerifiedLoans;

}



@PostMapping("/verifies")

public VerifiedLoans addVerified(@RequestBody VerifiedLoans theVerifiedLoans){

theVerifiedLoans.setVerId(0);

iVerServ.save(theVerifiedLoans);

return theVerifiedLoans;



}







@DeleteMapping("/verifies/{verId}")

public String deleteVerified(@PathVariable int verId){

VerifiedLoans theVerifiedLoans=iVerServ.findById(verId);

        if(theVerifiedLoans==null) {

        throw new RuntimeException("verified id not found-"+verId);

        }

        iVerServ.deleteById(verId);

        return "Deleted verificationId: "+verId;



}



}