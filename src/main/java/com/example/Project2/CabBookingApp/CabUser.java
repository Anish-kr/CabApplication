package com.example.Project2.CabBookingApp;

public class CabUser extends PersonDetails{

	private Integer cabUserId;
	
	public CabUser(Integer cabUserId,String name, String gender, Integer age) {
		super(name, gender, age);
		this.setCabUserId(cabUserId);
		// TODO Auto-generated constructor stub
	}

	public Integer getCabUserId() {
		return cabUserId;
	}

	public void setCabUserId(Integer cabUserId) {
		this.cabUserId = cabUserId;
	}

	
	//private static List<PersonDetails> cabusers=new ArrayList<>();
	
	//add a CabUser
	
	//get list of cabUsers
	
	//delete a cab User
	
}
