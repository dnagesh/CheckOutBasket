package com.shopping.basket;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DiscountCalculatorTest {
	
	CostCalculator calculator = null;
	@Before
	public void setUp(){
		
		calculator = new DiscountCalculator();
    	
    }
 
	@Test
	public void testWhenNodata() {
		
		String[] items = null;
		assertTrue("checking value zero", calculator.getTotalPrice(items) == 0.0);

	}
	
	@Test
	public void testWhenInvalidItems() {
		
		String[] items = {"Berries","Grapes"};
		assertTrue("checking value zero", calculator.getTotalPrice(items) == 0.0);

	}
	
	@Test
	public void testWhenApplesExist() {
		
		String[] items = {"Apple","Apple"};
		assertTrue("checking buy one get one offer on apple", calculator.getTotalPrice(items) == 0.60);

	}
	
	@Test
	public void testWhenOrangesExist() {
		
		String[] items = {"Orange","Orange","Orange"};
		assertTrue("checking buy two and get one offer an Orange", calculator.getTotalPrice(items) == 0.5);

	}
	
	@Test
	public void testWhenBothExist() {
		
		String[] items = {"Apple","Orange","Apple","Apple"};
		assertTrue("checking discount on combo", calculator.getTotalPrice(items) == 1.45);

	}

}
