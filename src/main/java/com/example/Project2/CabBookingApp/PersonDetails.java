package com.example.Project2.CabBookingApp;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;


public class PersonDetails {
	
	@Size(min=2,message="Minimum 2 characters req")
	@JsonProperty("Person_name")
	private String name;
	
	@Size(max=2,message="Minimum 2 characters req")
	@JsonProperty("Person_Gender")
	private String gender;
	
	@Positive
	@JsonProperty("Person_Age")
	private Integer age;
	
	public PersonDetails(String name, String gender, Integer age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "CabUser [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
	
	
	
}
