package com.mastek.trainticketbooking.model;

import com.mastek.trainticketbooking.model.Passenger;
import com.mastek.trainticketbooking.model.Ticket;

public class Ticket extends Passenger {

	public int ticketID;
	public final double ticketCost = 1000;
	public double totalCost;
	public int tempAge;
	public double costPerPassenger = 0;
	public int seatNo;
	public Ticket obj1;

	private static int counter = 1001;
	private static int seatNumber = 1;

	public Ticket() {
		super();

	}

	public Ticket(int ticketID, double totalCost) {
		super();

		this.totalCost = totalCost;
	}

	public Ticket(String pname, int age, String gender) {
		super(pname, age, gender);
		getCostPerPassenger();
		this.seatNo = seatNumber++;
		this.ticketID = counter++;

	}

	public Ticket(String from, String to) {
		// TODO Auto-generated constructor stub
	}

	public double getCostPerPassenger() {

		if (age < 12) {
			this.costPerPassenger = ticketCost * 0.5;
		} else {
			costPerPassenger = ticketCost;
		}

		return costPerPassenger;
	}

	// TODO Auto-generated method stub

}
