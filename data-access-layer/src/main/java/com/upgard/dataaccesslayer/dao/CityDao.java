package com.upgard.dataaccesslayer.dao;

import com.upgard.dataaccesslayer.entities.City;

public interface CityDao {
    public City save(City city) ; // CREATE
    public City findById(int id) ; // READ
    public City update(City city) ; // UPDATE
    public void delete(City city) ; // DELETE
}
