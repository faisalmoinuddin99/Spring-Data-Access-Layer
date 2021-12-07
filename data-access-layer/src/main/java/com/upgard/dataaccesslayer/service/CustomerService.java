package com.upgard.dataaccesslayer.service;

import com.upgard.dataaccesslayer.entities.Customer;
import com.upgard.dataaccesslayer.exceptions.CustomerDetailsNotFoundException;
import com.upgard.dataaccesslayer.exceptions.CustomerUserNameExistsException;
import com.upgard.dataaccesslayer.exceptions.UserTypeDetailsNotFoundException;

public interface CustomerService {
    public Customer acceptCustomerDetails(Customer customer) throws CustomerUserNameExistsException, UserTypeDetailsNotFoundException;
    public Customer getCustomerDetails(int id) throws CustomerDetailsNotFoundException ;
    public Customer getCustomerDetailsByUsername (String username) throws CustomerDetailsNotFoundException ;
    public Customer updateCustomerDetails(int id, Customer customer) throws CustomerUserNameExistsException, CustomerDetailsNotFoundException, UserTypeDetailsNotFoundException ;
}
