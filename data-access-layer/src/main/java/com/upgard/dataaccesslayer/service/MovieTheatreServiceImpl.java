package com.upgard.dataaccesslayer.service;

import com.upgard.dataaccesslayer.dao.MovieDao;
import com.upgard.dataaccesslayer.dao.MovieTheatreDao;
import com.upgard.dataaccesslayer.entities.Movie;
import com.upgard.dataaccesslayer.entities.MovieTheatre;
import com.upgard.dataaccesslayer.entities.Theatre;
import com.upgard.dataaccesslayer.exceptions.MovieDetailsNotFoundException;
import com.upgard.dataaccesslayer.exceptions.TheatreDetailsNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "movieTheatreService")
public class MovieTheatreServiceImpl implements MovieTheatreService{


    @Autowired
    private MovieTheatreDao movieTheatreDao ;

    @Autowired
    public Movie movie ;

    @Autowired
    public Theatre theatre ;


    @Override
    public MovieTheatre acceptMovieTheatreDetails(MovieTheatre movieTheatre) throws MovieDetailsNotFoundException, TheatreDetailsNotFoundException {

        return movieTheatreDao.save(movieTheatre);
    }

    @Override
    public MovieTheatre getMovieTheatreDetails(int id) throws MovieDetailsNotFoundException {
        movieTheatreDao.findById(id) ;
        return null;
    }

    @Override
    public boolean deleteMovieTheatre(int id) throws MovieDetailsNotFoundException {
        MovieTheatre savedMovieTheatre = getMovieTheatreDetails(id) ;
        movieTheatreDao.delete(savedMovieTheatre);
        return true;
    }

    @Override
    public List<MovieTheatre> getAllMovieTheatreDetails() {
        return movieTheatreDao.findAll();
    }
}
