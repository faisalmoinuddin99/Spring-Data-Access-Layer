package com.upgard.dataaccesslayer.dao;

import com.upgard.dataaccesslayer.entities.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository("bookingDao")
public interface BookingDao extends JpaRepository<Booking, Integer> {

}
