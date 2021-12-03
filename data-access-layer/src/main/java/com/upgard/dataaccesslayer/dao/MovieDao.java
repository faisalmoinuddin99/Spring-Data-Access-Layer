package com.upgard.dataaccesslayer.dao;

import com.upgard.dataaccesslayer.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieDao extends JpaRepository<Movie,Integer> {
}
