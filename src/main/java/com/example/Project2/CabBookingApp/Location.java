package com.example.Project2.CabBookingApp;


public class Location {

	private Integer xvalue;
	private Integer yvalue;
	
	public Location(Integer xvalue, Integer yvalue) {
		super();
		this.xvalue = xvalue;
		this.yvalue = yvalue;
	}

	public Integer getXvalue() {
		return xvalue;
	}

	public void setXvalue(Integer xvalue) {
		this.xvalue = xvalue;
	}

	public Integer getYvalue() {
		return yvalue;
	}

	public void setYvalue(Integer yvalue) {
		this.yvalue = yvalue;
	}

	@Override
	public String toString() {
		return "Location [xvalue=" + xvalue + ", yvalue=" + yvalue + "]";
	}
	
	
	
	
	
}
