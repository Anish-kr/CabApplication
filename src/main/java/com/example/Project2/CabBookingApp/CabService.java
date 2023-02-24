package com.example.Project2.CabBookingApp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class CabService {

	private static List<CabUser> cabusers=new ArrayList<>();
	private static List<Driver> drivers=new ArrayList<>();
	private static HashSet<Driver> set=new HashSet<>();
	
	static {
		cabusers.add(new CabUser(1,"anish","m",28));
		cabusers.add(new CabUser(2,"anish","m",28));
		cabusers.add(new CabUser(3,"anish","m",28));
	}
	
	static {
		drivers.add(new Driver(1,"Ramesh","m",29,(new Vehicle("swift","42")),(new Location(12,13))));
	}
	public List<CabUser> allCabUsers() {
			return cabusers;
	}

	public List<Driver> allDrivers() {
		// TODO Auto-generated method stub
		return drivers;
	}
	


	public CabUser addnewCabUser(CabUser cabuser) {
		cabusers.add(cabuser);
		return cabuser;
	}

	public Driver addnewDriver(Driver driver) {
		drivers.add(driver);
		return driver;
	}

	public HashSet<Driver> find_ride(int x,int y) {
		set.clear();
		//check if any driver within 5 unit
		for(Driver d:drivers)
		{
			Location lofDriver=d.getLocation();
			//Location lofrider=ride.getSource();
			if(Math.abs(lofDriver.getXvalue()-x)<=5 || Math.abs(lofDriver.getYvalue()-y)<=5)
				set.add(d);
		}
		return set;
	}
	
	
}
