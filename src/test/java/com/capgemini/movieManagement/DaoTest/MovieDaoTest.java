package com.capgemini.movieManagement.DaoTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.capgemini.movieManagement.dao.MovieDao;
import com.capgemini.movieManagement.dao.ShowDao;
import com.capgemini.movieManagement.util.MovieRepository;

public class MovieDaoTest {
	
	@Test
	public void movieSearhTest()
	{
		MovieRepository.initalizeMovie();
		assertEquals("Panipat",MovieDao.searchMovieById(3002).getMovieName());
		assertEquals("Tanhaji",MovieDao.searchMovieById(3004).getMovieName());
	}

}
