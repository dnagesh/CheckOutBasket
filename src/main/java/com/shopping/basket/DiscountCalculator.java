package com.shopping.basket;

import java.util.Arrays;
import java.util.List;
/**
 * This class calculates the total price based on the discount
 * @author nageshdarjipati
 *
 */
public class DiscountCalculator implements CostCalculator {

	public double getTotalPrice(String[] orderItems) {

		// returns 0 when items are empty.
		if (orderItems == null) {
			return 0.0;
		}
		List<String> items = Arrays.asList(orderItems);
		long noOfApples = items.stream().filter(s -> s.equals("Apple")).count();
		long noOfOranges = items.stream().filter(s -> s.equals("Orange")).count();
		//by one get one for apples
		double costOfApples = (noOfApples / 2 + noOfApples % 2) * Item.APPLE.getPrice();
		//buy two oranges and get third one free
		double costOfOranges = ((noOfOranges / 3) * 2 + noOfOranges % 3) * Item.ORANGE.getPrice();
		return costOfApples + costOfOranges;

	}

}
