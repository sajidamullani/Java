package com.mastem.shoppingcard.model;
import java.text.NumberFormat;
public class Item implements Comparable<Item> {
	
		private String name;
	private double price;
	private int quantity;
	
	public Item(String name, double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	

	
	public String toString() {
		NumberFormat fmt=NumberFormat.getCurrencyInstance();
		return name+"\t "+fmt.format(price)+"\t"+quantity+"\t"+fmt.format(price *quantity);
	}
	public int compareTo(Item other) {
		if(this.getPrice()*getQuantity()>other.getPrice()*other.getQuantity())
			return 1;
		else if(this.getPrice()*this.getQuantity()<other.getPrice()*other.getQuantity())
			return -1;
		return 0;
		
	}
	

	
}
