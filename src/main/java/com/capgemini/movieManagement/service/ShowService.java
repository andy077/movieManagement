package com.capgemini.movieManagement.service;

import java.util.List;

import com.capgemini.movieManagement.dao.ShowDao;
import com.capgemini.movieManagement.dto.Show;
import com.capgemini.movieManagement.exceptions.InvalidShowIdException;

public class ShowService{
	
    static ShowDao showdao = new ShowDao();
	public static int cntDigits(int showId){
		int cnt=0;
		while(showId!=0) {
			showId/=10;
			cnt++;
		}
		return cnt;
	}
	public static void upLocalDateSeatsBooked(int showId) throws InvalidShowIdException {
		if(cntDigits(showId)<8)throw new InvalidShowIdException("Invalid show id");
		else showdao.showSearch(showId);
	}

}
