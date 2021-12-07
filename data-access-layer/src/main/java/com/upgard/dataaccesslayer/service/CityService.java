package com.upgard.dataaccesslayer.service;

import com.upgard.dataaccesslayer.entities.City;
import com.upgard.dataaccesslayer.exceptions.CityDetailsNotFoundException;

import java.util.List;

public interface CityService {

    public City acceptCityDetails(City city) ;
    public City updateCityDetails(int id, City city) ;
    public City getCityDetails(int id) throws CityDetailsNotFoundException;
    public City getMovieDetailsByCityName(String cityName) throws CityDetailsNotFoundException ;
    public boolean deleteCity(int id) throws CityDetailsNotFoundException ;
    public List<City> getAllCityDetails() ;

}
