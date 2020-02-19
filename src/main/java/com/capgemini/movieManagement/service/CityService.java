package com.capgemini.movieManagement.service;

import com.capgemini.movieManagement.exceptions.InvalidCityException;
import com.capgemini.movieManagement.util.CityRepository;

public class CityService{
	public static void validateCity(String city) throws InvalidCityException{
		for(int i=0;i<CityRepository.CITY.length;i++){
			if(CityRepository.CITY[i].equalsIgnoreCase(city))return;
		}
		throw new InvalidCityException("City name not matched the list");
	}
}
