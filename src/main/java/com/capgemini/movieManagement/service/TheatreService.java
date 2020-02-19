package com.capgemini.movieManagement.service;

import com.capgemini.movieManagement.exceptions.InvalidTheatreIdException;

public class TheatreService{
	public static void validateTheatreId(int id) throws InvalidTheatreIdException{
		String s=""+id;
		if(s.length()<4||s.charAt(0)!='2') throw new InvalidTheatreIdException("Theatre id given is not valid");
	}
}
