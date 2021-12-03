package com.upgard.dataaccesslayer.dao;

import com.upgard.dataaccesslayer.entities.UserType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserTypeDao extends JpaRepository<UserType, Integer> {
}
