package com.shopping.basket;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.DoubleAdder;

public class DiscountCalculator {
	
	public static double getTotalPrice(String[] orderItems) {

		// returns 0 when items are empty.
		if (orderItems == null) {
			return 0.0;
		}
		List<String> items = Arrays.asList(orderItems);
		DoubleAdder adder = new DoubleAdder();
		items.forEach(item->{
			try {
				adder.add( Item.valueOf(item.toUpperCase()).getPrice());
			} catch (IllegalArgumentException illegalExp) {
				// log the exception
			}
				
		});
		
	
		return adder.doubleValue();

	}


}
