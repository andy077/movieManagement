package com.capgemini.movieManagement.dao;

import com.capgemini.movieManagement.dto.Movie;
import com.capgemini.movieManagement.util.MovieRepository;

public class MovieDao implements MovieDaoInterface {
	public Movie searchMovieById(int id) {
		for(int i=0;i<MovieRepository.getMoviesList().size();i++) {
			if(MovieRepository.getMoviesList().get(i).getMovieId()==id)return MovieRepository.getMoviesList().get(i);
		}
		return null;
	}

}
