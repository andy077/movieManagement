package com.capgemini.movieManagement.UI;

import java.util.*;
import com.capgemini.movieManagement.dao.MovieDao;
import com.capgemini.movieManagement.dao.ShowDao;
import com.capgemini.movieManagement.dao.TheatreDao;
import com.capgemini.movieManagement.dao.TicketDao;
import com.capgemini.movieManagement.dto.Movie;
import com.capgemini.movieManagement.dto.Seat;
import com.capgemini.movieManagement.dto.Show;
import com.capgemini.movieManagement.dto.Theatre;
import com.capgemini.movieManagement.dto.Ticket;
import com.capgemini.movieManagement.exceptions.InvalidCityException;
import com.capgemini.movieManagement.exceptions.InvalidMovieIdException;
import com.capgemini.movieManagement.exceptions.InvalidShowIdException;
import com.capgemini.movieManagement.exceptions.InvalidTheatreIdException;
import com.capgemini.movieManagement.service.CityService;
import com.capgemini.movieManagement.service.MovieService;
import com.capgemini.movieManagement.service.ShowService;
import com.capgemini.movieManagement.service.TheatreService;
import com.capgemini.movieManagement.util.CityRepository;
import com.capgemini.movieManagement.util.MovieRepository;
import com.capgemini.movieManagement.util.SeatRepository;
import com.capgemini.movieManagement.util.ShowRepository;
import com.capgemini.movieManagement.util.TheatreRepository;
import com.capgemini.movieManagement.util.TicketRepository;

public class UserInterface 
{	
	public static void init() 
	{
		ShowRepository.initializeShow();
		MovieRepository.initalizeMovie();
		TheatreRepository.initializeTheatre();
	}
	public static void main(String[] args) 
	{		
		MovieDao movieDao = new MovieDao();
		
		Scanner in=new Scanner(System.in);
		init();
		try {
		
			System.out.println("\n** WELCOME TO CINEMA HOUSE **");
			
			//Booking the ticket
			//Showing all the cities
			System.out.println("\nEnter a City Name from the Given List of Cities:\n");
			for(int i=0;i<CityRepository.CITY.length;i++){
				System.out.println(CityRepository.CITY[i]);
			}
			
			String city=in.next();
			CityService.validateCity(city); //validating the city
			ArrayList<Theatre> theatreList=TheatreDao.findTheatreByCity(city); //Getting the theatre list which matches the city
			for(int i=0;i<theatreList.size();i++)
				System.out.println(theatreList.get(i).getTheatreId()+" "+theatreList.get(i).getTheatreName());
			
			System.out.println("Enter a theatre Id to See the Movie List");
			int theatreId=in.nextInt();
			TheatreService.validateTheatreId(theatreId);
			Theatre theatre=TheatreDao.getTheatreById(theatreId);
			if(theatre==null) {
				System.out.println("Theatre id cannot be left blank");
				System.exit(0);
			}
			
			for(int i=0;i<theatre.getListOfMovie().size();i++) {
				System.out.println(theatre.getListOfMovie().get(i).getMovieId()+" "+theatre.getListOfMovie().get(i).getMovieName());
			}
			System.out.println("Select a movie by id");
			int id=in.nextInt();
			MovieService.validateMovieId(id);
			Movie movie=movieDao.searchMovieById(id);
			if(movie==null) {
				System.out.println("Movie id cannot be blank");
				System.exit(0);
			}
			System.out.print("Movie Name: "+movie.getMovieName()+"\n"+"Movie Director: "+movie.getMovieDirector()+"\n"+"Movie Languages: "+movie.getLanguages()+"\n"+"Movie Length"+movie.getMovieLength()+" hours");
			System.out.println("\n\nEnter the number of seats to be booked :");
			int seats=in.nextInt();
			
			TicketDao.addTicket(12345678,seats,"C",true,"Viva1");
			
			System.out.println("* Seat has been booked *, Here is the ticket generated");
			System.out.println("Ticket Id: "+TicketRepository.ticketList.get(0).getTicketId());
			System.out.println("Number of Seats Booked: "+TicketRepository.ticketList.get(0).getNoOfseats());
			System.out.println("Seat Name: "+TicketRepository.ticketList.get(0).getSeatName());
			System.out.println("Screen Name: "+TicketRepository.ticketList.get(0).getScreenName());
			System.out.println("Booking Status: "+TicketRepository.ticketList.get(0).getTicketStatus());
			
			System.out.println("\nThank You for Visiting :)");
		} 

		catch (InvalidCityException e) {
			System.out.println(e.getMessage());
		} catch (InvalidTheatreIdException e) {
			System.out.println(e.getMessage());
		} catch (InvalidMovieIdException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}
