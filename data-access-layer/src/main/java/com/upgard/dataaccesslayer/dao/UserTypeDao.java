package com.upgard.dataaccesslayer.dao;

import com.upgard.dataaccesslayer.entities.UserType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("userTypeDao")
public interface UserTypeDao extends JpaRepository<UserType, Integer> {

    public UserType findByUserTypeName(String userTypeName) ;

}
