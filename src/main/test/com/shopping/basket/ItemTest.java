package com.shopping.basket;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ItemTest {
	
	@Test
	public void testOrangePrice()
	{
		Item d  = Item.valueOf("ORANGE");
	    assertTrue("Ornage Price ", d.getPrice() == 0.25);
	}
	
	@Test
	public void testApplePrice()
	{
		Item d  = Item.valueOf("APPLE");
	    assertTrue("Ornage Price ", d.getPrice() == 0.60);
	}

	@Test(expected=IllegalArgumentException.class)
	public void testBerriesPrice()
	{
		Item d  = Item.valueOf("Berries");
	}

}
