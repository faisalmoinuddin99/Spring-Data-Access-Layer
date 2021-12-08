package com.upgard.dataaccesslayer;

import com.upgard.dataaccesslayer.dao.*;
import com.upgard.dataaccesslayer.entities.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class MovieBookingApplication {

	public static void main(String[] args) {

		ApplicationContext context =  SpringApplication.run(MovieBookingApplication.class, args);



		/*
		CityDao cityDao = context.getBean(CityDao.class) ;
		City city = new City() ;
		city.setCity_name("Mumbai");
		System.out.println(cityDao.save( city)); */
/*
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
		movieDao.findBymovieNameAndDuration("Avengers: Infinity War", 150)
				.forEach(movie -> System.out.println(movie.getMovieName()));


		// City
		CityDaoImpl cityDao = context.getBean(CityDaoImpl.class) ;
		City city1 = new City() ;

		city1.setCityName("Mumbai");
		cityDao.save(city1) ;

		// Theatre CRUD operation and Pagination
		TheatreDao theatreDao = context.getBean(TheatreDao.class) ;

		Theatre theatre1 = new Theatre() ;
		theatre1.setTheatreName("Prithvi Theatre");
		theatre1.setTicketPrice(400.00);

		Theatre theatre2 = new Theatre() ;
		theatre2.setTheatreName("Maratha Mandir");
		theatre2.setTicketPrice(350.00);

		Theatre theatre3 = new Theatre() ;
		theatre3.setTheatreName("Tata Theatre");
		theatre3.setTicketPrice(450.00);

		Theatre theatre4 = new Theatre() ;
		theatre4.setTheatreName("Regal Cinema - Mumbai");
		theatre4.setTicketPrice(500.00);

		Theatre theatre5 = new Theatre() ;
		theatre5.setTheatreName("Liberty Carnival Cinemas");
		theatre5.setTicketPrice(250.00);

		List<Theatre> theatres = new ArrayList<>() ;
		theatres.add(theatre1) ;
		theatres.add(theatre2) ;
		theatres.add(theatre3) ;
		theatres.add(theatre4) ;
		theatres.add(theatre5) ;

		theatreDao.saveAll(theatres) ;

		// Pagination
		System.out.println("****************** Finding First Page of the theatre *********************");
		Page<Theatre> page0 = theatreDao.findAll(PageRequest.of(0,2)) ;
		page0.stream().forEach(theatre -> System.out.println(theatre.getTheatreName()));

		System.out.println("****************** Finding Second Page of the theatre *********************");
		Page<Theatre> page1 = theatreDao.findAll(PageRequest.of(1,2)) ;
		page1.stream().forEach(theatre -> System.out.println(theatre.getTheatreName()));


		// Language Entity
		LanguageDao languageDao = context.getBean(LanguageDao.class) ;

		Language language1 = new Language() ;
		language1.setLanguageName("Hindi");

		Language language2 = new Language() ;
		language2.setLanguageName("English");

		List<Language> languages = new ArrayList<>() ;
		languages.add(language1) ;
		languages.add(language2) ;

		languageDao.saveAll(languages) ;


		// UserType Entity
		UserTypeDao userTypeDao = context.getBean(UserTypeDao.class) ;

		UserType userType1 = new UserType() ;
		userType1.setUsetTypeName("Admin");

		UserType userType2 = new UserType() ;


		List<UserType> userTypes = new ArrayList<>() ;
		userTypes.add(userType1) ;
		userTypes.add(userType2) ;

		userTypeDao.saveAll(userTypes) ;
*/
	}



}
