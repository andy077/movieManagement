package com.capgemini.movieManagement.util;

import java.time.LocalDate;
import java.util.*;

import com.capgemini.movieManagement.dto.Movie;
import com.capgemini.movieManagement.dto.Theatre;

public class TheatreRepository {
	public static ArrayList<Theatre> theatreList=new ArrayList();
	public static void initializeTheatre() {
		Theatre th1=new Theatre();
		Movie movie1=new Movie();
		th1.setTheatreId(2001);
		th1.setManagerContact("8765457890");
		th1.setTheatreCity("Patna");
		th1.setTheatreName("Patna Movie House");
		movie1.setLanguages("English");
		ArrayList<Movie> movieList1=new ArrayList();
		movieList1.add(MovieRepository.getMoviesList().get(0));
		movieList1.add(MovieRepository.getMoviesList().get(1));
		movieList1.add(MovieRepository.getMoviesList().get(2));
		movieList1.add(MovieRepository.getMoviesList().get(3));
		movieList1.add(MovieRepository.getMoviesList().get(4));
		movieList1.add(movie1);
		th1.setListOfMovie(movieList1);
		theatreList.add(th1);
		
		Theatre th2=new Theatre();
		Movie movie2=new Movie();
		th2.setTheatreId(2002);
		th2.setManagerContact("9877671679");
		th2.setTheatreCity("Pune");
		th2.setTheatreName("CinePolis Cinema Hall");
		movie2.setLanguages("Hindi");
		movie2.setMoveGenre(null);
		movie2.setMovieDirector("Anurag Kashyap");
		movie2.setMovieId(3002);
		movie2.setMovieLength(03);
		movie2.setMovieName("Gangs Of Wasseppur");
		ArrayList<Movie> movieList2=new ArrayList();
		movieList2.add(MovieRepository.getMoviesList().get(0));
		movieList2.add(MovieRepository.getMoviesList().get(1));
		movieList2.add(MovieRepository.getMoviesList().get(2));
		movieList2.add(MovieRepository.getMoviesList().get(3));
		movieList2.add(MovieRepository.getMoviesList().get(4));
		movieList2.add(movie2);
		th2.setListOfMovie(movieList2);
		theatreList.add(th2);
		
		Theatre th3=new Theatre();
		Movie movie3=new Movie();
		th3.setTheatreId(2003);
		th3.setManagerContact("6166165155");
		th3.setTheatreCity("Mumbai");
		th3.setTheatreName("Mumbai Cinema Hall");
		movie3.setLanguages("English");
		movie3.setMoveGenre(null);
		movie3.setMovieDirector("David Yates");
		movie3.setMovieId(3003);
		movie3.setMovieLength(03);
		movie3.setMovieName("Pirates Of Carribean");
		ArrayList<Movie> movieList3=new ArrayList();
		movieList3.add(MovieRepository.getMoviesList().get(0));
		movieList3.add(MovieRepository.getMoviesList().get(1));
		movieList3.add(MovieRepository.getMoviesList().get(2));
		movieList3.add(MovieRepository.getMoviesList().get(3));
		movieList3.add(MovieRepository.getMoviesList().get(4));
		movieList3.add(movie3);
		th3.setListOfMovie(movieList3);
		theatreList.add(th3);
	}
}
