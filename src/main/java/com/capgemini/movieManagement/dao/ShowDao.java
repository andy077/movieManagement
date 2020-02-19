package com.capgemini.movieManagement.dao;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.capgemini.movieManagement.dto.Seat;
import com.capgemini.movieManagement.dto.Show;
import com.capgemini.movieManagement.dto.Ticket;
import com.capgemini.movieManagement.util.ShowRepository;
import com.capgemini.movieManagement.util.TicketRepository;

public class ShowDao {
	//Searching for the show
	public static Show showSearch(int showId) {
		ArrayList<Show> showList=ShowRepository.getShowList();
		for(int i=0;i<showList.size();i++) {
			if(showList.get(i).getShowId()==showId) {
				return showList.get(i);
			}
		}
		return null;
	}
}


