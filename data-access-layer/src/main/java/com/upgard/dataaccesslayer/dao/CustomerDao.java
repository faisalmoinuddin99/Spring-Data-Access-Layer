package com.upgard.dataaccesslayer.dao;

import com.upgard.dataaccesslayer.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerDao extends JpaRepository<Customer, Integer> {

    public Customer findByuserName(String username) ;


}
