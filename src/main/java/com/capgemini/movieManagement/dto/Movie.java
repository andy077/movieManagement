package com.capgemini.movieManagement.dto;

import java.time.LocalDate;

public class Movie {
	
	// Declaring Variables
	private int movieId;
	private String movieName;
	private Show moveGenre;
	private String movieDirector;
	private int movieLength;
	private String languages;
	private LocalDate movieReleaseDate;
	
	// Creating Getters and Setters for the Variables
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public Show getMoveGenre() {
		return moveGenre;
	}
	public void setMoveGenre(Show moveGenre) {
		this.moveGenre = moveGenre;
	}
	public String getMovieDirector() {
		return movieDirector;
	}
	public void setMovieDirector(String string) {
		this.movieDirector = string;
	}
	public int getMovieLength() {
		return movieLength;
	}
	public void setMovieLength(int movieLength) {
		this.movieLength = movieLength;
	}
	public String getLanguages() {
		return languages;
	}
	public void setLanguages(String languages) {
		this.languages = languages;
	}
	public LocalDate getMovieReleaseDate() {
		return movieReleaseDate;
	}
	public void setMovieReleaseDate(LocalDate movieReleaseDate) {
		this.movieReleaseDate = movieReleaseDate;
	}
	
	// Creating Constructor 
	public Movie(int movieId, String movieName, Show moveGenre, String movieDirector, int movieLength,
			String languages, LocalDate movieReleaseDate) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.moveGenre = moveGenre;
		this.movieDirector = movieDirector;
		this.movieLength = movieLength;
		this.languages = languages;
		this.movieReleaseDate = movieReleaseDate;
	}
	
	// Creating a Constructor for Super Class
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
