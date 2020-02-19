package com.capgemini.movieManagement.util;
import java.util.ArrayList;
import java.util.List;

import com.capgemini.movieManagement.dto.Seat;
import com.capgemini.movieManagement.dto.Show;

public class SeatRepository {
	
	public static List<Seat> seatInfo = new ArrayList<Seat>();
	
	public void initializeSeats()
	{
		Seat obje1 = new Seat();
		obje1.setSeatId("c1-c4");
		obje1.setSeatPrice(50.00);
		
		seatInfo.add(obje1);
	}

	public static List<Seat> getSeatInfo() {
		return seatInfo;
	}

	public static void setSeatInfo(List<Seat> seatInfo) {
		SeatRepository.seatInfo = seatInfo;
	}
	
}
