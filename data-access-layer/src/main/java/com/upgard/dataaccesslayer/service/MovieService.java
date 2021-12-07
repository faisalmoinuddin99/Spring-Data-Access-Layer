package com.upgard.dataaccesslayer.service;

import com.upgard.dataaccesslayer.entities.Movie;
import com.upgard.dataaccesslayer.exceptions.MovieDetailsNotFoundException;

import java.awt.print.Pageable;
import java.util.List;

public interface MovieService {

    // Save a new movie
    public Movie acceptMovieDetails(Movie movie) ;
    // Search an existing movie based on its ID
    public Movie getMovieDetails(int id) throws MovieDetailsNotFoundException;
    // Update an existing movie
    public Movie updateMovieDetails(int movieId, Movie movie) throws MovieDetailsNotFoundException, MovieDetailsNotFoundException;
    // Delete an existing movie
    public boolean deleteMovie(int id) throws MovieDetailsNotFoundException;
    // Get all the movies
    public List<Movie> getAllMoviesDetails() ;
    // Make a paginated request
    public List<Movie> getPaginatedMoviesDetails(Pageable pageRequest)  ;

}
