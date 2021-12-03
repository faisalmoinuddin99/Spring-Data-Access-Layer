package com.upgard.dataaccesslayer.dao;

import com.upgard.dataaccesslayer.entities.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.criteria.CriteriaBuilder;

public interface BookingDao extends JpaRepository<Booking, Integer> {

}
