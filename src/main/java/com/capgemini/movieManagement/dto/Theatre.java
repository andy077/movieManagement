package com.capgemini.movieManagement.dto;

import java.util.ArrayList;

public class Theatre {
	// Declaring Variables
	private int theatreId;
	private String theatreName;
	private String theatreCity;
	private ArrayList<Movie> listOfMovie;
	private Screen listOfScreens;
	private String managerName;
	private String managerContact;
	
	// Generate Getters and Setters for the Variables
	public int getTheatreId() {
		return theatreId;
	}
	public void setTheatreId(int theatreId) {
		this.theatreId = theatreId;
	}
	public String getTheatreName() {
		return theatreName;
	}
	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}
	public String getTheatreCity() {
		return theatreCity;
	}
	public void setTheatreCity(String theatreCity) {
		this.theatreCity = theatreCity;
	}
	public ArrayList<Movie> getListOfMovie() {
		return listOfMovie;
	}
	public void setListOfMovie(ArrayList<Movie> listOfMovie) {
		this.listOfMovie = listOfMovie;
	}
	public Screen getListOfScreens() {
		return listOfScreens;
	}
	public void setListOfScreens(Screen listOfScreens) {
		this.listOfScreens = listOfScreens;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public String getManagerContact() {
		return managerContact;
	}
	public void setManagerContact(String managerContact) {
		this.managerContact = managerContact;
	}
	
	
}
