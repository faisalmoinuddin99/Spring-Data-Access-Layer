package com.upgard.dataaccesslayer.service;

import com.upgard.dataaccesslayer.dao.BookingDao;
import com.upgard.dataaccesslayer.entities.Booking;
import com.upgard.dataaccesslayer.exceptions.BookingDetailsNotFoundException;
import com.upgard.dataaccesslayer.exceptions.CustomerDetailsNotFoundException;
import com.upgard.dataaccesslayer.exceptions.MovieDetailsNotFoundException;
import com.upgard.dataaccesslayer.exceptions.MovieTheatreDetailsNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "bookingService")
public class BookingSerivceImpl implements BookingService{

    @Autowired
    private BookingDao bookingDao ;

    @Autowired
    public MovieTheatreService movieTheatreService ;

    @Autowired
    public CustomerService customerService ;

    @Override
    public Booking acceptBookingDetails(Booking booking) throws MovieTheatreDetailsNotFoundException, CustomerDetailsNotFoundException, MovieDetailsNotFoundException {
        movieTheatreService.getMovieTheatreDetails(booking.getMovieTheatre().getMovieTheatreId()) ;
        customerService.getCustomerDetails(booking.getCustomer().getCustomerId()) ;
         bookingDao.save(booking) ;
         return booking ;

    }

    @Override
    public Booking getBookingDetails(int id) throws BookingDetailsNotFoundException {
        return bookingDao.findById(id)
                .orElseThrow(
                        () -> new BookingDetailsNotFoundException("Booking Not Found For Id: " + id)
                ) ;
    }

    @Override
    public boolean deleteBooking(int id) throws BookingDetailsNotFoundException {
        Booking savedBooking = getBookingDetails(id) ;
        bookingDao.delete(savedBooking) ;
        return true;
    }

    @Override
    public List<Booking> getAllBookingDetails() {
        return bookingDao.findAll() ;
    }
}
