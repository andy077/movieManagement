package com.capgemini.movieManagement.util;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.movieManagement.dto.Movie;
import com.capgemini.movieManagement.dto.Seat;
import com.capgemini.movieManagement.dto.Show;

public class ShowRepository {
	public static ArrayList<Show> showList = new ArrayList<Show>();
	static SeatRepository seatObject1 = new SeatRepository();
	
	public static void initializeShow()
	{		
		Show object1 = new Show();
		object1.setShowId(11111111);
		object1.setShowName("Harry Potter");
		object1.setShowStartTime("2020-03-02 - 01:00:00 PM");
		object1.setShowEndTime("2020-03-02 - 02:30:00 PM");
		object1.setSeats(null);		
		object1.setMovieName(null);
		object1.setScreenId(201);
		object1.setTheaterId(301);
		
		showList.add(object1);
	
		Show object2 = new Show();
		object2.setShowId(22034205);
		object2.setShowStartTime("2020-03-02 - 01:30:00 PM");
		object2.setShowEndTime("2020-03-02 - 04:15:00 PM");
		object2.setSeats(null);
		object2.setShowName("Tanhaji");
		object2.setMovieName(null);
		object2.setScreenId(202);
		object2.setTheaterId(302);
		
		showList.add(object2);
		
		Show object3 = new Show();
		object3.setShowId(32164652);
		object3.setShowStartTime("2020-03-02 - 11:45:00 AM");
		object3.setShowEndTime("2020-03-02 - 02:30:00 PM");
		object3.setSeats(null);
		object3.setShowName("Panipat");
		object3.setMovieName(null);
		object3.setScreenId(203);
		object3.setTheaterId(303);
		
		showList.add(object3);
		
		Show object4 = new Show();
		object4.setShowId(15234875);
		object4.setShowStartTime("2020-03-02 - 03:30:00 PM");
		object4.setShowEndTime("2020-03-02 - 06:00:00 PM");
		object4.setSeats(null);
		object4.setShowName("Parasite");
		object4.setMovieName(null);
		object4.setScreenId(204);
		object4.setTheaterId(304);
		
		showList.add(object4);
		
		Show object5 = new Show();
		object5.setShowId(10531548);
		object5.setShowStartTime("2020-03-02 - 06:30:00 PM");
		object5.setShowEndTime("2020-03-02 - 09:15:00 PM");
		object5.setSeats(null);
		object5.setShowName("Shinkara");
		object5.setMovieName(null);
		object5.setScreenId(205);
		object5.setTheaterId(305);
		
		showList.add(object5);
	
		
	}

	public static ArrayList<Show> getShowList() {
		return showList;
	}
}
