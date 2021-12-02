package com.upgard.dataaccesslayer;

import com.upgard.dataaccesslayer.dao.CityDao;
import com.upgard.dataaccesslayer.entities.City;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DataAccessLayerApplication {

	public static void main(String[] args) {

		ApplicationContext context =  SpringApplication.run(DataAccessLayerApplication.class, args);

		CityDao cityDao = context.getBean(CityDao.class) ;
		City city = new City() ;
		city.setCity_name("Mumbai");
		System.out.println(cityDao.save( city));
	}

}
