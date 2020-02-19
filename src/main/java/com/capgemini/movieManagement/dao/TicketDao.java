package com.capgemini.movieManagement.dao;

import com.capgemini.movieManagement.dto.Booking;
import com.capgemini.movieManagement.dto.Ticket;
import com.capgemini.movieManagement.util.TicketRepository;

public class TicketDao {
	public static void addTicket(int ticketId,int noOfseats,String seatName,boolean ticketStatus,String screenName) {
		Ticket ticket=new Ticket();
		ticket.setNoOfseats(noOfseats);
		ticket.setScreenName(screenName);
		ticket.setSeatName(seatName);
		ticket.setTicketId(ticketId);
		ticket.setTicketStatus(ticketStatus);
		TicketRepository.ticketList.add(ticket);
	}
}
