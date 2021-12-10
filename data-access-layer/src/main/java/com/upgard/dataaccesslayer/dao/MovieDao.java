package com.upgard.dataaccesslayer.dao;

import com.upgard.dataaccesslayer.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("movieDao")
public interface MovieDao extends JpaRepository<Movie,Integer> {

    //public List<Movie> findByName(String name) ;
    public List<Movie> findByMovieNameAndDuration(String name, int duration) ;
}
