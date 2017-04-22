package com.shopping.basket;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CheckOutCalculatorTest {
	
	CheckOutCalculator checkOutCalculator = null;
	@Before
	public void setUp(){
		
		checkOutCalculator = new CheckOutCalculator();
    	
    }
 
	@Test
	public void testWhenNodata() {
		
		String[] items = null;
		assertTrue("checking value zero", checkOutCalculator.getTotalPrice(items) == 0.0);

	}
	
	@Test
	public void testWhenInvalidItems() {
		
		String[] items = {"Berries","Grapes"};
		assertTrue("checking value zero", checkOutCalculator.getTotalPrice(items) == 0.0);

	}
	
	@Test
	public void testWhenApplesExist() {
		
		String[] items = {"Apple","Apple"};
		assertTrue("checking value zero", checkOutCalculator.getTotalPrice(items) == 1.20);

	}
	
	@Test
	public void testWhenOrangesExist() {
		
		String[] items = {"Orange","Orange"};
		assertTrue("checking value zero", checkOutCalculator.getTotalPrice(items) == 0.5);

	}
	
	@Test
	public void testWhenBothExist() {
		
		String[] items = {"Apple","Orange","Apple","Apple"};
		assertTrue("checking value zero", checkOutCalculator.getTotalPrice(items) == 2.05);

	}

}
