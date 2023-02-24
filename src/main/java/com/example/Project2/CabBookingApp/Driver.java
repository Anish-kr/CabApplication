package com.example.Project2.CabBookingApp;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Driver extends PersonDetails{

	
	//private PersonDetails person;
	
	private Integer driverId;
	@JsonProperty("Vehicle_details")
	private Vehicle vehicle;
	@JsonProperty("Location")
	private Location location;
	
	
	
	public Driver(Integer driverId,String name, String gender, Integer age,Vehicle vehicle,Location location) {
		super(name, gender, age);
		this.driverId=driverId;
		this.setLocation(location);
		this.setVehicle(vehicle);
		
		// TODO Auto-generated constructor stub
	}
	
	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Integer getDriverId() {
		return driverId;
	}

	public void setDriverId(Integer driverId) {
		this.driverId = driverId;
	}
	
		
	
	
}
