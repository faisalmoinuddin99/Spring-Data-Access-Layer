package com.upgard.dataaccesslayer.service;

import com.upgard.dataaccesslayer.dao.UserTypeDao;
import com.upgard.dataaccesslayer.entities.UserType;
import com.upgard.dataaccesslayer.exceptions.UserTypeDetailsNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "userTypeService")
public class UserTypeServiceImpl implements UserTypeService{

    @Autowired
    private UserTypeDao userTypeDao ;

    @Override
    public UserType acceptUserTypeDetails(UserType userType) {
        return userTypeDao.save(userType);
    }

    @Override
    public UserType getUserTypeDetails(int id) throws UserTypeDetailsNotFoundException {
        return userTypeDao.findById(id)
                .orElseThrow(
                        () -> new UserTypeDetailsNotFoundException("UserType not found with id: "  + id )
                ) ;
    }

    @Override
    public UserType getUserTypeDetailsFromUserTypeName(String userType) throws UserTypeDetailsNotFoundException {
        return userTypeDao.findByUserTypeName(userType);
    }

    @Override
    public boolean deleteUserType(int id) throws UserTypeDetailsNotFoundException {
       UserType savedUserType = getUserTypeDetails(id) ;
       userTypeDao.delete(savedUserType);

        return true;
    }

    @Override
    public List<UserType> getAllUserTypeDetails() {
        return userTypeDao.findAll();
    }
}
