package com.example.Project2.CabBookingApp;

public class Ride {

	private String name;
	private Source source;
	private Destination destination;
	
	
	

	public Ride(String name, Source source, Destination destination) {
		super();
		this.setName(name);
		this.source = source;
		this.destination = destination;
	}


	public Source getSource() {
		return source;
	}


	public void setSource(Source source) {
		this.source = source;
	}


	public Destination getDestination() {
		return destination;
	}


	public void setDestination(Destination destination) {
		this.destination = destination;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	}
