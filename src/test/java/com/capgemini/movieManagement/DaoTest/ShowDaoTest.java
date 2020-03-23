package com.capgemini.movieManagement.DaoTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.capgemini.movieManagement.dao.ShowDao;
import com.capgemini.movieManagement.util.ShowRepository;

public class ShowDaoTest {
	
	ShowDao showdao = new ShowDao();
	@Test
	public void showSearchTest() {
		ShowRepository.initializeShow();
		assertEquals("Harry Potter",showdao.showSearch(11111111).getShowName());
		
		assertEquals("Panipat",showdao.showSearch(32164652).getShowName());
		
		assertEquals("Tanhaji",showdao.showSearch(22034205).getShowName());
	}
}
