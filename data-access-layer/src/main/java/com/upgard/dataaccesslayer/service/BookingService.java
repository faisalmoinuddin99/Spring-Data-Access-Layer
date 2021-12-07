package com.upgard.dataaccesslayer.service;

import com.upgard.dataaccesslayer.entities.Booking;
import com.upgard.dataaccesslayer.exceptions.BookingDetailsNotFoundException;
import com.upgard.dataaccesslayer.exceptions.MovieDetailsNotFoundException;

import java.util.List;

public interface BookingService {
    public Booking acceptBookingDetails(Booking booking) throws MovieDetailsNotFoundException ;
    public Booking getBookingDetails(int id) throws BookingDetailsNotFoundException ;
    public boolean deleteBooking(int id) throws  BookingDetailsNotFoundException ;
    public List<Booking> getAllBookingDetails() ;
}
