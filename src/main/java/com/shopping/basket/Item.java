package com.shopping.basket;

/**
 * Item enum to define the fruits with prices.
 * @author nageshdarjipati
 *
 */
public enum Item {

	ORANGE(0.25), APPLE(0.60);

	Item(double price) {
		this.price = price;
	}

	private double price;

	public double getPrice() {
		return price;
	}

}