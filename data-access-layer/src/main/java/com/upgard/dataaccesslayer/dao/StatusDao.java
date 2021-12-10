package com.upgard.dataaccesslayer.dao;

import com.upgard.dataaccesslayer.entities.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("statusDao")
public interface StatusDao extends JpaRepository<Status,Integer> {
}
