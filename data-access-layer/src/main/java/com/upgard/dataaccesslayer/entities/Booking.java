package com.upgard.dataaccesslayer.entities;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "booking")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int booking_id ;

    @Column(nullable = false)
    private LocalDateTime booking_date ;

    @Column(nullable = false)
    private int no_of_seat ;

    public int getBooking_id() {
        return booking_id;
    }

    public void setBooking_id(int booking_id) {
        this.booking_id = booking_id;
    }

    public LocalDateTime getBooking_date() {
        return booking_date;
    }

    public void setBooking_date(LocalDateTime booking_date) {
        this.booking_date = booking_date;
    }

    public int getNo_of_seat() {
        return no_of_seat;
    }

    public void setNo_of_seat(int no_of_seat) {
        this.no_of_seat = no_of_seat;
    }
}
