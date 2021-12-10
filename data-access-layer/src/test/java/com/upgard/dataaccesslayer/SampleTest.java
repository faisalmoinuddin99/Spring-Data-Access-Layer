package com.upgard.dataaccesslayer;

import com.upgard.dataaccesslayer.service.CityService;
import com.upgard.dataaccesslayer.service.MovieTheatreService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SampleTest {

    @Autowired
    private CityService cityService ;

    @Autowired
    private MovieTheatreService movieTheatreService ;

    @Test
    public void testCityServiceNotNull(){

        System.out.println(cityService);
        System.out.println(movieTheatreService);
    }

    // Assertion
    @Test
    public void testMoiveTheatreServiceNotNull(){
        Assertions.assertNotNull(movieTheatreService);
    }
}
