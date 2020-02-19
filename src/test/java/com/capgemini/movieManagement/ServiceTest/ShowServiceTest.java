package com.capgemini.movieManagement.ServiceTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.capgemini.movieManagement.service.ShowService;

public class ShowServiceTest {
	
	@Test
	public void cntDigitsTest() {
		assertEquals(3,ShowService.cntDigits(112));
		
		assertEquals(6,ShowService.cntDigits(112325));
		
		assertEquals(5,ShowService.cntDigits(16498));
	}
	
}
