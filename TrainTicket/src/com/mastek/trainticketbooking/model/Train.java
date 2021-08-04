package com.mastek.trainticketbooking.model;

import java.time.LocalTime;
import java.util.Date;

public class Train extends Passenger {
	String trainID="MH20778956D";
	String trainName="Mandavi";
	String from;
	String to;
	Date date=new Date();
	LocalTime time=java.time.LocalTime.now();
		
	public Train() {
		super();
	}


	public Train(String trainID, String trainName, String from, String to, Date date, LocalTime time) {
		super();
		this.trainID = trainID;
		this.trainName = trainName;
		this.from = from;
		this.to = to;
		this.date = date;
		this.time = time;
	}


	public Train(String pname, int age, String gender) {
		super(pname, age, gender);
	
		
	}


	 public String getDetails() {
		return "Train ID: "+this.trainID+"\nTrain Name: "+this.trainName+"\nFrom: "+this.from+"\nTo: "
	           +this.to+"\nDate: "+this.date+"\nTime:"+this.time;
	}

}
