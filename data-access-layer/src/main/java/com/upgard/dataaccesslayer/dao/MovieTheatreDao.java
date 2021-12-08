package com.upgard.dataaccesslayer.dao;

import com.upgard.dataaccesslayer.entities.MovieTheatre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieTheatreDao extends JpaRepository<MovieTheatre, Integer> {
}
