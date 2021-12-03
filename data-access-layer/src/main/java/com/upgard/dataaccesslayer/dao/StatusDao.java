package com.upgard.dataaccesslayer.dao;

import com.upgard.dataaccesslayer.entities.Status;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusDao extends JpaRepository<Status,Integer> {
}
