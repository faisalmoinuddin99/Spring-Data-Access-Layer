package com.upgard.dataaccesslayer.service;

import com.upgard.dataaccesslayer.entities.UserType;
import com.upgard.dataaccesslayer.exceptions.UserTypeDetailsNotFoundException;

import java.util.List;

public interface UserTypeService {

    public UserType acceptUserTypeDetails(UserType userType) ;
    public UserType getUserTypeDetails(int id) throws UserTypeDetailsNotFoundException ;
    public UserType getUserTypeDetailsFromUserTypeName(String userType) throws  UserTypeDetailsNotFoundException ;
    public boolean deleteUserType(int id) throws  UserTypeDetailsNotFoundException ;
    public List<UserType> getAllUserTypeDetails() ;

}
