package com.mastek.cartservice;

import java.util.ArrayList;
import java.util.ListIterator;


public class CartService {
	
	ArrayList<Item> item;
	double totalAmount;
	double payableAmount;
	double discount;
	double tax;
	String coupon;
	public CartService() {
		this.item = new ArrayList<Item>();
		this.coupon = "";
		this.totalAmount = 0;
		this.payableAmount = 0;
		this.discount = 0;
		this.tax = 0;
	}
	public void addToCart(Item item) {
		this.item.add(item);
	}
	public void showCart() {
		ListIterator<Item> iterator = item.listIterator();
		while(iterator.hasNext()) {
			Item item1 = iterator.next();
			System.out.println(item1);
		}
	}
	public void removeFromCart(Item i) {
		ListIterator<Item> iterator1 = item.listIterator();
		while(iterator1.hasNext()) {
			Item item2 = iterator1.next();
			if (item2.getItemName().equals(i.getItemName())) {
				this.item.remove(i);
				break;
			}
		}
	}
	public double getTotalAmount() {
		ListIterator<Item> iterator2 = item.listIterator();
		this.totalAmount = 0;
		while(iterator2.hasNext()) {
			Item item3 = iterator2.next();
			this.totalAmount = this.totalAmount + (item3.getItemPrice() * item3.getQuantity());
		}
		return this.totalAmount;
	}
	public void applyCoupon(String coupon) {
		this.coupon = coupon;
		if (coupon.equals("BLACK")) {
			this.discount = this.getTotalAmount() * (0.5);
			this.totalAmount = this.totalAmount - this.discount;
		} else {
			this.totalAmount = this.totalAmount+0 ;
		}
	}
	public double getPayableAmount() {
		this.payableAmount = 0;
		this.tax = this.totalAmount * (0.2);
		this.payableAmount = this.totalAmount + this.tax;
		return this.payableAmount;
	}
	public void printInvoice() {
		ListIterator<Item> iterator3 = item.listIterator();
		while(iterator3.hasNext()) {
			Item item4 = iterator3.next();
			System.out.print(item4.getItemName() + "\t");
			System.out.print(item4.getQuantity() + "\t");
			System.out.print(item4.getItemPrice() + "\t");
			System.out.println(item4.getItemPrice() * item4.getQuantity());
		}
		System.out.println("\t\t\t" + "Total    : " + this.getTotalAmount());
		this.applyCoupon(this.coupon);
		System.out.println("\t\t\t" + "Discount : " + this.discount);
		this.getPayableAmount();
		System.out.println("\t\t\t" + "Tax      : " + this.tax);
		System.out.println("\t\t\t" + "Total    : " + this.getPayableAmount());
	}
	
}
