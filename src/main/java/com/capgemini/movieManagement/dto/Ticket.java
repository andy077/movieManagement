package com.capgemini.movieManagement.dto;

public class Ticket {
	// Declaring Variables
	private int ticketId;
	private int noOfseats;
	private String seatName;
	private Booking bookingRef;
	private boolean ticketStatus;
	private String screenName;
	
	// Creating Getter and Setter for the Variables
	public int getTicketId() {
		return ticketId;
	}
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	public int getNoOfseats() {
		return noOfseats;
	}
	public void setNoOfseats(int noOfseats) {
		this.noOfseats = noOfseats;
	}
	public String getSeatName() {
		return seatName;
	}
	public void setSeatName(String seatName) {
		this.seatName = seatName;
	}
	public Booking getBookingRef() {
		return bookingRef;
	}
	public void setBookingRef(Booking bookingRef) {
		this.bookingRef = bookingRef;
	}
	public boolean getTicketStatus() {
		return ticketStatus;
	}
	public void setTicketStatus(boolean ticketStatus) {
		this.ticketStatus = ticketStatus;
	}
	public String getScreenName() {
		return screenName;
	}
	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}
	
	

}
