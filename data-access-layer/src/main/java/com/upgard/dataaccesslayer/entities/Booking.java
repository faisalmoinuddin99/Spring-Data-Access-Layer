package com.upgard.dataaccesslayer.entities;

import javax.persistence.*;
import java.time.LocalDateTime;

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
}
