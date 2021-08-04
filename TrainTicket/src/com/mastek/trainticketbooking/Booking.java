package com.mastek.trainticketbooking;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.mastek.trainticketbooking.model.Passenger;
import com.mastek.trainticketbooking.model.Ticket;
import com.mastek.trainticketbooking.model.Train;

public class Booking {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Train train = new Train();
		Ticket ticket = null;
		Passenger p1 = null;
		
		double totalCost = 0;

		Map<Integer, Passenger> map = new HashMap<Integer, Passenger>();

		Map<Integer, Ticket> map2 = new HashMap<Integer, Ticket>();

		System.out.println("Enter No of passenger only 3 passenger allow ");
		Integer passengerCount = sc.nextInt();

		if (passengerCount < 3) {

		int countID = 0;

		while (passengerCount > 0 && passengerCount <= 3) {

		countID++;

		System.out.println("Enter Passenger " + countID + " Details.\n");
		System.out.println("Enter Passenger Name: ");
		String pName = sc.next();

		System.out.println("Enter Passenger Age: ");
		Integer age = sc.nextInt();

		// System.out.println("Enter Passenger Gender male/female: ");
		// Enum gender=Type.valueOf(sc1.next().toUpperCase());

		System.out.println("Enter Passenger Gender male/female: ");
		String gender = sc.next();
				
		System.out.println("Enter source: ");
		String from = sc.next();

		System.out.println("Enter destination: ");
		String to = sc.next();

		p1 = new Passenger(pName, age, gender);
		ticket = new Ticket(pName, age, gender);
		ticket.obj1 = new Ticket(from, to);

		map.put(countID, p1);
		map2.put(countID, ticket);

		passengerCount--;

		}
		System.out.println();
		System.out.println("Ticket Print is here...");
		System.out.println("Ticket ID:" + ticket.ticketID);
		System.out.println(train.getDetails());
		System.out.println(ticket.obj1);
		System.out.println();

		System.out.println("ID" + "  Name  " + " Age " + " Gender " + " SeatNo " + " CostOfTicket");

		System.out.println();
		for (Map.Entry<Integer, Ticket> entry : map2.entrySet()) {
		int key = entry.getKey();
		Ticket b = entry.getValue();

		totalCost = totalCost + b.costPerPassenger;

		System.out.println(key + "  " + b.getPname() + "    " + b.getAge() + "  " + b.getGender() + "   "
						+ b.seatNo + "     " + b.costPerPassenger);
		}
		} else {
			System.out.println("Only 3 passengers allowed Try again..");
		}
		System.out.println("=============================================================================");
		System.out.println("Total Cost=\t\t\t" + totalCost);
	}

}


