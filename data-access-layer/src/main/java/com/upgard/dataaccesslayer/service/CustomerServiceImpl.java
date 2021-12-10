package com.upgard.dataaccesslayer.service;

import com.upgard.dataaccesslayer.dao.CustomerDao;
import com.upgard.dataaccesslayer.entities.Customer;
import com.upgard.dataaccesslayer.exceptions.CustomerDetailsNotFoundException;
import com.upgard.dataaccesslayer.exceptions.CustomerUserNameExistsException;
import com.upgard.dataaccesslayer.exceptions.UserTypeDetailsNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "customerService")
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerDao customerDao ;

    @Autowired
    private UserTypeService userTypeService ;

    @Override
    public Customer acceptCustomerDetails(Customer customer) throws CustomerUserNameExistsException, UserTypeDetailsNotFoundException {

        if(isPresent(customerDao.findByUserName(customer.getUserName()))){
            throw new CustomerUserNameExistsException("This username is already taken") ;
        }
        userTypeService.getUserTypeDetails(customer.getUserType().getUserTypeId()) ;
        return customerDao.save(customer);
    }

    @Override
    public Customer getCustomerDetails(int id) throws CustomerDetailsNotFoundException {
        return customerDao.findById(id)
                .orElseThrow(
                        ()-> new CustomerDetailsNotFoundException("Customer not found with id :" + id)
                ) ;
    }

    @Override
    public Customer getCustomerDetailsByUsername(String username) throws CustomerDetailsNotFoundException {
        return customerDao.findByUserName(username) ;
    }

    @Override
    public Customer updateCustomerDetails(int id, Customer customer) throws CustomerUserNameExistsException, CustomerDetailsNotFoundException, UserTypeDetailsNotFoundException {
       Customer savedCustomer = getCustomerDetails(id) ;

        if(isNotNullOrZero(customer.getFirstName())) {
            savedCustomer.setFirstName(customer.getFirstName());
        }
        if (isNotNullOrZero(customer.getLastName())){
            savedCustomer.setLastName(customer.getLastName());
        }
        if (isNotNullOrZero(customer.getPassword())){
            savedCustomer.setPassword(customer.getPassword());
        }
        if (isNotNullOrZero(customer.getDateOfBirth())){
            savedCustomer.setDateOfBirth(customer.getDateOfBirth());
        }
        if (isNotNullOrZero(customer.getUserName())){
            savedCustomer.setUserName(customer.getUserName());
        }
        return customerDao.save(savedCustomer);
    }

    private boolean isNotNullOrZero(Object object){
        return object != null ;
    }

    private boolean isNotNullOrZero(int val) {
        return val != 0 ;
    }

    private boolean isPresent(Object object){
        return object != null ;
    }
}
