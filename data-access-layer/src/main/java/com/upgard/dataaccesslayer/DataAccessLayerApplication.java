package com.upgard.dataaccesslayer;

import com.upgard.dataaccesslayer.dao.MovieDao;
import com.upgard.dataaccesslayer.entities.Movie;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DataAccessLayerApplication {

	public static void main(String[] args) {

		ApplicationContext context =  SpringApplication.run(DataAccessLayerApplication.class, args);

		/*
		CityDao cityDao = context.getBean(CityDao.class) ;
		City city = new City() ;
		city.setCity_name("Mumbai");
		System.out.println(cityDao.save( city)); */

		MovieDao movieDao = context.getBean(MovieDao.class) ;

		Movie movie1 = new Movie() ;
		movie1.setMovieName("Avengers: Infinity War");
		movie1.setMovieDesc("Avengers: Infinity War is a 2018 American superhero film based on the Marvel Comics superhero team the Avengers." +
				"In the film, the Avengers and the Guardians of the Galaxy attempt to prevent Thanos from collecting the six all-powerful Infinity Stones as " +
				"part of his quest to kill half of all life in the universe.");
		movie1.setRelease_date(LocalDateTime.of(2018,4,27,5,30));
		movie1.setMovieDuration(150);
		movie1.setCoverPhotoUrl("https://upload.wikimedia.org/wikipedia/en/4/4d/Avengers_Infinity_War_poster.jpg");
		movie1.setTrailerUrl("https://youtu.be/6ZfuNTqbHE8");

		Movie movie2 = new Movie() ;

		movie2.setMovieName("Batman v Superman: Dawn of Justice");
		movie2.setMovieDesc("Bruce Wayne, a billionaire, believes that Superman is a threat to humanity after his battle in Metropolis. " +
				"Thus, he decides to adopt his mantle of Batman and defeat him once and for all.");
		movie2.setRelease_date(LocalDateTime.of(2016,3,25,2,31));
		movie2.setMovieDuration(120);
		movie2.setCoverPhotoUrl("https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcTyyCYy3OZeCzFfY71jjpeavzbKjXsXjHiUiyOlvPYht81UR9lp");
		movie2.setTrailerUrl("https://youtu.be/0WWzgGyAH6Y");

		List<Movie> movies = new ArrayList<>() ;
		movies.add(movie1) ;
		movies.add(movie2) ;

		movieDao.saveAll(movies) ;

		System.out.println("**** find by movie name****");
		movieDao.findBymovieName("Batman v Superman: Dawn of Justice")
				.forEach(movie -> System.out.println(movie.getMovieName()));

		System.out.println("**** find by movie name and duration ****");
		movieDao.findBymovieNameAndmovieDuration("Avengers: Infinity War", 150)
				.forEach(movie -> System.out.println(movie.getMovieName()));


	}

}
