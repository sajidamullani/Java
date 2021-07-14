package com.mastek.cartservice;

public class Item {
	
	private String itemName;
	private int quantity;
	private double itemPrice;
	public Item(String itemName, int quantity, double itemPrice) {
		
		this.itemName = itemName;
		this.quantity = quantity;
		this.itemPrice = itemPrice;
	}
	@Override
	public String toString() {
		return "Item [itemName=" + itemName + ", quantity=" + quantity + "]";
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}

}
