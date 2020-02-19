package com.capgemini.movieManagement.util;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

import com.capgemini.movieManagement.dto.Movie;

public class MovieRepository {
	public static ArrayList<Movie> movieInfo = new ArrayList<Movie>();
	
	public static void initalizeMovie()
	{
		//DATA
		
		Movie obj1 = new Movie();
		obj1.setMovieId(3001);
		obj1.setMovieName("Harry Potter");
		obj1.setMovieDirector("David Yates");
		obj1.setMovieLength(3);
		obj1.setLanguages("Hindi"+" "+"English");
		obj1.setMovieReleaseDate(LocalDate.of(2020, 1, 13));
		movieInfo.add(obj1);
		
		Movie obj2 = new Movie();
		obj2.setMovieId(3002);
		obj2.setMovieName("Panipat");
		obj2.setMovieDirector("Rahul Rajhanshi");
		obj2.setMovieLength(3);
		obj2.setLanguages("Hindi");
		obj2.setMovieReleaseDate(LocalDate.of(2020, 1, 13));
		movieInfo.add(obj2);
		
		Movie obj3 = new Movie();
		obj3.setMovieId(3003);
		obj3.setMovieName("Pirates Of Caribbean");
		obj3.setMovieDirector("David Yates");
		obj3.setMovieLength(3);
		obj3.setLanguages("Hindi"+" "+"English");
		obj3.setMovieReleaseDate(LocalDate.of(2020, 1, 13));
		movieInfo.add(obj3);
		
		Movie obj4 = new Movie();
		obj4.setMovieId(3004);
		obj4.setMovieName("Tanhaji");
		obj4.setMovieDirector("Rishabh Dandya");
		obj4.setMovieLength(3);
		obj4.setLanguages("Hindi");
		obj4.setMovieReleaseDate(LocalDate.of(2020, 1, 13));
		movieInfo.add(obj4);
		
		Movie obj5 = new Movie();
		obj5.setMovieId(3005);
		obj5.setMovieName("Shinkara");
		obj5.setMovieDirector("Rana Pratab");
		obj5.setMovieLength(3);
		obj5.setLanguages("Hindi");
		obj5.setMovieReleaseDate(LocalDate.of(2020, 1, 13));
		movieInfo.add(obj5);
	}
	//Return Data to MovieDao
	public static ArrayList<Movie> getMoviesList(){
		return movieInfo;
	}

}
