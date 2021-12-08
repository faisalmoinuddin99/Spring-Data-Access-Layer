package com.upgard.dataaccesslayer.entities;

import javax.persistence.*;

@Entity
@Table(name = "movie_theatre")
public class MovieTheatre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int movieTheatreId ;

    @ManyToOne
    @JoinColumn(name = "movieId", nullable = false)
    private Movie movie ;

    @ManyToOne
    @JoinColumn(name = "theatreId", nullable = false)
    private Theatre theatre ;
}
