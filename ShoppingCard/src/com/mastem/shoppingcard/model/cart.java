package com.mastem.shoppingcard.model;

import java.text.NumberFormat;
import java.util.Arrays;

public class cart {
	
protected int capacity;
Item[]cart;
protected double totalPrice;
protected int itemCount;
public cart() {
	capacity=5;
	 itemCount = 0;
	totalPrice=0.0;
}
public void addtocart(String itemname, double itemprice, int quantity) {
Item temp=new Item(itemname,itemprice,quantity);
totalPrice+=(itemprice*quantity);
for(int i=0;i<quantity;i++)
{
cart[itemCount+i]=temp;
itemCount+=quantity;
if(itemCount==capacity)
{
increaseSize();
	
}



	
}
}
@Override
public String toString() {
	
	NumberFormat fmt=NumberFormat.getCurrencyInstance();
	String contents="\nShopping Cart";
	contents+="\nItem\t\tUnit Price\t Quantity\tTotal\n";
	for(int i=0;i<itemCount;i++) 
		
		contents +=cart[i].toString()+"\n";
	
	contents+="\nTotal Price"+fmt.format(totalPrice);
	contents+="\n";
	return contents;
}


private void increaseSize() {
	
	Item[] temp=new Item[capacity+3];
	for(int i=0;i<capacity;i++)
	{
		temp[i]=cart[i];
		
	}
	cart=temp;
	temp=null;
	capacity=cart.length;
}
}
