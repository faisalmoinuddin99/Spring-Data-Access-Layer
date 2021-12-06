package com.upgard.dataaccesslayer.service;

import com.upgard.dataaccesslayer.dao.MovieDao;
import com.upgard.dataaccesslayer.entities.Movie;
import com.upgard.dataaccesslayer.exception.MovieDetailsNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;

@Service(value = "movieService")
 public class MovieServiceImpl implements MovieSerive{
    
    @Autowired
    public MovieDao movieDao ;

    @Override
    public Movie acceptMovieDetails(Movie movie) {
        return movieDao.save(movie);
    }

    @Override
    public Movie getMovieDetails(int id) throws MovieDetailsNotFoundException {
        return movieDao.findById(id)
                .orElseThrow(
                        () -> new MovieDetailsNotFoundException("Movie Not Found for Id: " + id)
                );
    }

    @Override
    public Movie updateMovieDetails(int movieId, Movie movie) throws MovieDetailsNotFoundException {
        Movie savedMovie = getMovieDetails(movieId) ;

        if(isNotNullOrZero(movie.getMovieName())){
            savedMovie.setMovieName(movie.getMovieName());
        }
        if(isNotNullOrZero(movie.getMovieDesc())){
            savedMovie.setMovieDesc(movie.getMovieDesc());
        }
        if (isNotNullOrZero(movie.getRelease_date())){
            savedMovie.setRelease_date(movie.getRelease_date());
        }

        if(isNotNullOrZero(movie.getMovieDuration())){
            savedMovie.setMovieDuration(movie.getMovieDuration());
        }

        if(isNotNullOrZero(movie.getCoverPhotoUrl())){
            savedMovie.setCoverPhotoUrl(movie.getCoverPhotoUrl());
        }

        if (isNotNullOrZero(movie.getTrailerUrl())){
            savedMovie.setTrailerUrl(movie.getTrailerUrl());
        }

        if (isNotNullOrZero(movie.getStatus())){
            savedMovie.setStatus(movie.getStatus());
        }

        return movieDao.save(savedMovie);
    }

    @Override
    public boolean deleteMovie(int id) throws MovieDetailsNotFoundException {

        Movie savedMovie = getMovieDetails(id) ;
        movieDao.delete(savedMovie);
        return true;
    }

    @Override
    public List<Movie> getAllMoviesDetails() {
        return movieDao.findAll();
    }

    @Override
    public List<Movie> getPaginatedMoviesDetails(Pageable pageRequest) {
        return movieDao.findAll((Sort) pageRequest);
    }

    private boolean isNotNullOrZero(Object object){
        return object != null ;
    }

    private boolean isNotNullOrZero(int val) {
        return val != 0 ;
    }
}
