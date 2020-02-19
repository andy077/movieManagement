package com.capgemini.movieManagement.dto;

public class Seat {
	
	// Declaring the Variables
	private String seatId;
	private double seatPrice;
	
	// Creating Getters and Setters for the Variables
	public String getSeatId() {
		return seatId;
	}
	public void setSeatId(String seatId) {
		this.seatId = seatId;
	}
	public double getSeatPrice() {
		return seatPrice;
	}
	public void setSeatPrice(double seatPrice) {
		this.seatPrice = seatPrice;
	}
	
	// Creating Constructor
	public Seat(String seatId, double seatPrice) {
		super();
		this.seatId = seatId;
		this.seatPrice = seatPrice;
	}
	
	// Creating a Constructor for Super Class
	public Seat() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
