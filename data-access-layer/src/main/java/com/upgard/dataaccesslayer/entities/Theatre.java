package com.upgard.dataaccesslayer.entities;

import javax.persistence.*;

@Entity
@Table(name = "theatre")
public class Theatre {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int theatre_id ;

    @Column(nullable = false, unique = true)
    private String theatre_name ;

    @Column(nullable = false, columnDefinition = "DECIMAL(13, 2) default '150.00'" )
    private double ticket_price ;

    public int getTheatre_id() {
        return theatre_id;
    }

    public void setTheatre_id(int theatre_id) {
        this.theatre_id = theatre_id;
    }

    public String getTheatre_name() {
        return theatre_name;
    }

    public void setTheatre_name(String theatre_name) {
        this.theatre_name = theatre_name;
    }

    public double getTicket_price() {
        return ticket_price;
    }

    public void setTicket_price(double ticket_price) {
        this.ticket_price = ticket_price;
    }
}
