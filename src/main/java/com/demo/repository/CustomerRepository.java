package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.CustomerDetails;

public interface CustomerRepository extends JpaRepository<CustomerDetails, Integer> {

}
