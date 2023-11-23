package com.demo.repository;



import org.springframework.data.jpa.repository.JpaRepository;



import com.demo.entity.VerifiedLoans;



public interface IVerifiedRepo extends JpaRepository<VerifiedLoans,Integer>{



}