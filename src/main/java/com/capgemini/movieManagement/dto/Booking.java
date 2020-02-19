package com.capgemini.movieManagement.dto;

import java.time.LocalDate;

public class Booking {
	
	// Declaring the Variables
	private int bookingId;
	private int movieId;
	private int showId;
	private Show showRef;
	private LocalDate bookingDate;
	private int transactionId;
	private double totalCost;
	private Seat seatList;
	private Ticket ticket;
	
	// Creating Getters and Setter for the Variables
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public int getShowId() {
		return showId;
	}
	public void setShowId(int showId) {
		this.showId = showId;
	}
	public Show getShowRef() {
		return showRef;
	}
	public void setShowRef(Show showRef) {
		this.showRef = showRef;
	}
	public LocalDate getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public double getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}
	public Seat getSeatList() {
		return seatList;
	}
	public void setSeatList(Seat seatList) {
		this.seatList = seatList;
	}
	public Ticket getTicket() {
		return ticket;
	}
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	
	// Creating Constructor
	public Booking(int bookingId, int movieId, int showId, Show showRef, LocalDate bookingDate, int transactionId,
			double totalCost, Seat seatList, Ticket ticket) {
		super();
		this.bookingId = bookingId;
		this.movieId = movieId;
		this.showId = showId;
		this.showRef = showRef;
		this.bookingDate = bookingDate;
		this.transactionId = transactionId;
		this.totalCost = totalCost;
		this.seatList = seatList;
		this.ticket = ticket;
	}
	
	// Creating a Constructor for Super Class
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
