package com.upgard.dataaccesslayer.entities;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "booking")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookingId ;

    @Column(nullable = false)
    private LocalDateTime bookingDate ;

    @Column(nullable = false)
    private int noOfSeat ;

    @ManyToOne
    @JoinColumn(name = "movie_theatre_id", nullable = false)
    private MovieTheatre movieTheatre ;

    @ManyToOne
    @JoinColumn(name = "customerId", nullable = false)
    private Customer customer ;

    public Booking() {
    }

    public Booking(int bookingId, LocalDateTime bookingDate, int noOfSeat, MovieTheatre movieTheatre, Customer customer) {
        this.bookingId = bookingId;
        this.bookingDate = bookingDate;
        this.noOfSeat = noOfSeat;
        this.movieTheatre = movieTheatre;
        this.customer = customer;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public LocalDateTime getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(LocalDateTime bookingDate) {
        this.bookingDate = bookingDate;
    }

    public int getNoOfSeat() {
        return noOfSeat;
    }

    public void setNoOfSeat(int noOfSeat) {
        this.noOfSeat = noOfSeat;
    }

    public MovieTheatre getMovieTheatre() {
        return movieTheatre;
    }

    public void setMovieTheatre(MovieTheatre movieTheatre) {
        this.movieTheatre = movieTheatre;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId=" + bookingId +
                ", bookingDate=" + bookingDate +
                ", noOfSeat=" + noOfSeat +
                ", movieTheatre=" + movieTheatre +
                ", customer=" + customer +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Booking)) return false;
        Booking booking = (Booking) o;
        return getBookingId() == booking.getBookingId() && getNoOfSeat() == booking.getNoOfSeat() && getBookingDate().equals(booking.getBookingDate()) && getMovieTheatre().equals(booking.getMovieTheatre()) && getCustomer().equals(booking.getCustomer());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBookingId(), getBookingDate(), getNoOfSeat(), getMovieTheatre(), getCustomer());
    }
}
