package com.upgard.dataaccesslayer.dao;

import com.upgard.dataaccesslayer.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieDao extends JpaRepository<Movie,Integer> {

    public List<Movie> findBymovieName(String name) ;
    public List<Movie> findBymovieNameAndDuration(String name, int duration) ;
}
