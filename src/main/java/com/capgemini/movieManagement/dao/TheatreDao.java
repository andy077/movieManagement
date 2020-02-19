package com.capgemini.movieManagement.dao;

import java.util.ArrayList;

import com.capgemini.movieManagement.dto.Theatre;
import com.capgemini.movieManagement.util.TheatreRepository;

public class TheatreDao {
	
	public static ArrayList<Theatre> findTheatreByCity(String city) {
		ArrayList<Theatre> resList=new ArrayList();
		for(int i=0;i<TheatreRepository.theatreList.size();i++) {
			if(TheatreRepository.theatreList.get(i).getTheatreCity().equalsIgnoreCase(city))
				resList.add(TheatreRepository.theatreList.get(i));
		}
		return resList;
	}
	
	public static Theatre getTheatreById(int id) {
		for(int i=0;i<TheatreRepository.theatreList.size();i++) {
			if(TheatreRepository.theatreList.get(i).getTheatreId()==id)return TheatreRepository.theatreList.get(i);
		}
		return null;
	}
}
