package com.capgemini.movieManagement.service;

import com.capgemini.movieManagement.exceptions.InvalidMovieIdException;
import com.capgemini.movieManagement.exceptions.InvalidTheatreIdException;

public class MovieService {
	
	public static int countMovieId(int MovieId){
		int cnt=0;
		while(MovieId!=0) {
			MovieId/=10;
			cnt++;
		}
		return cnt;
	}
	
	public static void validateMovieId(int id) throws InvalidMovieIdException{
		String s=""+id;
		if(s.length()<4||s.charAt(0)!='3') throw new InvalidMovieIdException("Movie id given is not valid");
	}

}
