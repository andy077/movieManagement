package com.capgemini.movieManagement.ServiceTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.capgemini.movieManagement.service.MovieService;
import com.capgemini.movieManagement.service.ShowService;

public class MovieServiceTest {
	
	@Test
	public void countMovieIdTest()
	{
		assertEquals(4,MovieService.countMovieId(1245));
	}

}
