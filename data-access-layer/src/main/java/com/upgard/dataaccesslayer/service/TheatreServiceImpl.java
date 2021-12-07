package com.upgard.dataaccesslayer.service;

import com.upgard.dataaccesslayer.dao.TheatreDao;
import com.upgard.dataaccesslayer.entities.Theatre;
import com.upgard.dataaccesslayer.exceptions.TheatreDetailsNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "theatreService")
public class TheatreServiceImpl implements TheatreService{

    @Autowired
    private TheatreDao theatreDao ;

    @Override
    public Theatre acceptTheatreDetails(Theatre theatre) {
        return theatreDao.save(theatre);
    }

    @Override
    public Theatre getTheatreDetails(int id) throws TheatreDetailsNotFoundException {
        return theatreDao.findById(id)
                .orElseThrow(
                        () -> new TheatreDetailsNotFoundException("Theatre Details Not Found For Id: " + id)
                ) ;
    }

    @Override
    public Theatre updateTheatreDetails(int id, Theatre theatre) throws TheatreDetailsNotFoundException {
        Theatre savedTheatre = getTheatreDetails(id) ;

        if(isNotNullOrZero(theatre.getTheatreName())){
            savedTheatre.setTheatreName(theatre.getTheatreName());
        }

        if (isNotNullOrZero(theatre.getTicketPrice())){
            savedTheatre.setTicketPrice(theatre.getTicketPrice());
        }
        return theatreDao.save(savedTheatre);
    }

    @Override
    public boolean deleteTheatre(int id) throws TheatreDetailsNotFoundException {
        Theatre savedTheatre = getTheatreDetails(id) ;
        theatreDao.delete(savedTheatre);
        return true;
    }

    @Override
    public List<Theatre> getAllTheatreDetails() {
        return theatreDao.findAll();
    }

    public boolean isNotNullOrZero(Object object){
        return  object != null ;
    }
    public boolean isNotNullOrZero(int val){
        return val != 0 ;
    }
}
