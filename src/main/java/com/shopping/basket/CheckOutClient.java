package com.shopping.basket;

public class CheckOutClient {

	public static void main(String args[]) {

		// 3 apples and 1 orange
		String[] items = { "Orange", "Apple", "Apple", "Apple" };
		double total = new CheckOutCalculator().getTotalPrice(items);
		System.out.println(total);

	}

}
