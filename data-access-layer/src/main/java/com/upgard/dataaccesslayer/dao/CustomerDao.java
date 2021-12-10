package com.upgard.dataaccesslayer.dao;

import com.upgard.dataaccesslayer.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("customerDao")
public interface CustomerDao extends JpaRepository<Customer, Integer> {

    public Customer findByUserName(String username) ;


}
