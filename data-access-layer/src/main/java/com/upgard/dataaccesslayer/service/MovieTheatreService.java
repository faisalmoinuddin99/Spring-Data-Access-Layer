package com.upgard.dataaccesslayer.service;

import com.upgard.dataaccesslayer.entities.MovieTheatre;
import com.upgard.dataaccesslayer.exceptions.MovieDetailsNotFoundException;
import com.upgard.dataaccesslayer.exceptions.TheatreDetailsNotFoundException;

import java.util.List;

public interface MovieTheatreService {

    public MovieTheatre acceptMovieTheatreDetails(MovieTheatre movieTheatre) throws MovieDetailsNotFoundException, TheatreDetailsNotFoundException ;
    public MovieTheatre getMovieTheatreDetails(int id) throws MovieDetailsNotFoundException ;
    public boolean deleteMovieTheatre(int id) throws  MovieDetailsNotFoundException ;
    public List<MovieTheatre> getAllMovieTheatreDetails() ;

}
