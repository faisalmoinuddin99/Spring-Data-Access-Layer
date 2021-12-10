package com.upgard.dataaccesslayer.dao;

import com.upgard.dataaccesslayer.entities.Theatre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("theatreDao")
public interface TheatreDao extends JpaRepository<Theatre, Integer> {
}
