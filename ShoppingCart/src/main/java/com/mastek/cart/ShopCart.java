package com.mastek.cart;
import java.util.Scanner;

import com.mastek.cartservice.CartService;
import com.mastek.cartservice.Item;


public class ShopCart {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		CartService cart = new CartService();
		
 	Item i1= null;
	System.out.println("How many product you want to buy [max=10]");
	Integer NumberOfProducts= sc.nextInt();
	while (NumberOfProducts>0){
		
		System.out.println("Enter Product Name");
		String itemName=sc.next();
		System.out.println("Enter your Quantity");
		Integer Quantity = sc.nextInt();
		System.out.println("Enter your Price");
	    Double Price= sc.nextDouble();
	
	    i1  = new Item(itemName,Quantity,Price);
	    cart.addToCart(i1);


    NumberOfProducts--;
	} 
 
	    cart.showCart();
	    
 
	   
	    cart.showCart();

	    double totalAmount = cart.getTotalAmount();
	    System.out.println(totalAmount);

	   
	    double payableAmount = cart.getPayableAmount();
	    System.out.println(payableAmount);    

	 
	    cart.applyCoupon("BLACK");
	   
	   cart.printInvoice();
	   
	   cart.removeFromCart(i1);
	   System.out.println("After Remove the item");

	   cart.printInvoice();
	  
	  


	  }
}
