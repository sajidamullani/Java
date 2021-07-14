package com.mastem.shoppingcard;

import java.util.Scanner;

import com.mastem.shoppingcard.model.Item;
import com.mastem.shoppingcard.model.cart;

public class Shopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     cart cart=new cart();
     
     String keepShopping;
     Item item;
     String itemname="";
     double itemprice;
     double totalPrice=0;
     int quantity=0;
     Scanner sc= new Scanner(System.in);
     do {
    	 System.out.println("Enter the name of the Item;");
    	 itemname=sc.next();
    	 System.out.println("Enter the Item's Price");
    	 itemprice=sc.nextDouble();
    	 System.out.println("Enter the Quantity of Item");
    	 quantity=sc.nextInt();
    	 totalPrice=(itemprice*quantity);
    	 cart.addtocart(itemname,itemprice,quantity);
    	 System.out.println(cart.toString());
    	 System.out.println("Would you like to continue shopping "+"(y/n)");
    	 keepShopping=sc.next();
    
    
    }while(keepShopping.equalsIgnoreCase("y"));
     System.out.println("please pay $"+totalPrice);
     
     
	}

}
