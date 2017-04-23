package com.shopping.basket;

public class CheckOutClient {

	public static void main(String args[]) {

		// 3 apples and 1 orange
		String[] items = { "Orange", "Apple", "Apple", "Apple" };
		
		CostCalculator calculator = new CheckOutCalculator();
		double total = calculator.getTotalPrice(items);
		System.out.println("checkout price  without discount : " + total);
		
		calculator = new DiscountCalculator();
		total = calculator.getTotalPrice(items);
		System.out.println("checkout price  with discount : " + total);

	}

}
