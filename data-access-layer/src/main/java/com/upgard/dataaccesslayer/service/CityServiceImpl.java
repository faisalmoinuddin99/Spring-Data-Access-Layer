package com.upgard.dataaccesslayer.service;

import com.upgard.dataaccesslayer.dao.CityDao;
import com.upgard.dataaccesslayer.entities.City;
import com.upgard.dataaccesslayer.exceptions.CityDetailsNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service(value = "cityService")
public class CityServiceImpl implements CityService{

    @Autowired
    private CityDao cityDao ;

    @Override
    public City acceptCityDetails(City city) {
        return cityDao.save(city);
    }

    @Override
    public City updateCityDetails(int id, City city) {
        return null;
    }

    @Override
    public City getCityDetails(int id) throws CityDetailsNotFoundException {
        return cityDao.findById(id) ;

    }

    @Transactional
    @Override
    public List<City> acceptMultipleCityDetails(List<City> cities){
        for (int i = 0 ; i < cities.size(); i++){
            cities.set(i, acceptCityDetails(cities.get(i))) ;
        }
        return cities ;
    }

    @Override
    public City getMovieDetailsByCityName(String cityName) throws CityDetailsNotFoundException {
        return null;
    }

    @Override
    public boolean deleteCity(int id) throws CityDetailsNotFoundException {
        return false;
    }

    @Override
    public List<City> getAllCityDetails() {
        return null;
    }
}
