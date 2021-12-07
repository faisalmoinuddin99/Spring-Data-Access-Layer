package com.upgard.dataaccesslayer.entities;

import javax.persistence.*;

@Entity
@Table(name = "theatre")
public class Theatre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int theatreId ;

    @Column(nullable = false, unique = true)
    private String theatreName ;

    @Column(nullable = false )
    private double ticketPrice = 150.00;

    @ManyToOne
    @JoinColumn(name = "cityId", nullable = false)
    private City city ;

    public int getTheatreId() {
        return theatreId;
    }

    public void setTheatreId(int theatreId) {
        this.theatreId = theatreId;
    }

    public String getTheatreName() {
        return theatreName;
    }

    public void setTheatreName(String theatreName) {
        this.theatreName = theatreName;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }
}
