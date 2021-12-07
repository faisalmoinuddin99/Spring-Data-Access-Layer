package com.upgard.dataaccesslayer.service;

import com.upgard.dataaccesslayer.entities.Theatre;
import com.upgard.dataaccesslayer.exceptions.TheatreDetailsNotFoundException;

import java.util.List;

public interface TheatreService {

    public Theatre acceptTheatreDetails(Theatre theatre);
    public Theatre getTheatreDetails(int id) throws TheatreDetailsNotFoundException ;
    public Theatre updateTheatreDetails(int id, Theatre theatre) throws TheatreDetailsNotFoundException ;
    boolean deleteTheatre(int id) throws TheatreDetailsNotFoundException ;
    public List<Theatre> getAllTheatreDetails() ;
}
