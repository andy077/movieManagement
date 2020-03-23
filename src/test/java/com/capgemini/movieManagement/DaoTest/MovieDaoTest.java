package com.capgemini.movieManagement.DaoTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.capgemini.movieManagement.dao.MovieDao;
import com.capgemini.movieManagement.dao.ShowDao;
import com.capgemini.movieManagement.util.MovieRepository;

public class MovieDaoTest {
	
	MovieDao movieDao = new MovieDao();
	
	@Test
	public void movieSearhTest()
	{
		MovieRepository.initalizeMovie();
		assertEquals("Panipat",movieDao.searchMovieById(3002).getMovieName());
		assertEquals("Tanhaji",movieDao.searchMovieById(3004).getMovieName());
	}

}
