package com.example.Project2.CabBookingApp;

import java.net.URI;
import java.util.HashSet;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class AppController {

	private CabService service;
	
	
	public AppController(CabService service) {
		super();
		this.service = service;
	}



	@GetMapping("/cabusers")
	public List<CabUser> getCabUsers()
	{
		return service.allCabUsers();
	}
	
	//add a user
	@PostMapping("/cabusers")
	public ResponseEntity<CabUser> addCabUser(@RequestBody CabUser cabuser)
	{
		CabUser newCabUser=service.addnewCabUser(cabuser);
		
		URI location=
				ServletUriComponentsBuilder
				.fromCurrentRequest().path("/{id}")
				.buildAndExpand(newCabUser.getCabUserId()).toUri();
		return ResponseEntity.created(location).build();
	}
	
	
	//add a driver
	
	@GetMapping("/drivers")
	public List<Driver> getDrivers()
	{
		return service.allDrivers();
	}
	
	
	//add a driver
		@PostMapping("/drivers")
		public ResponseEntity<Driver> addCabUser(@RequestBody Driver driver)
		{
			Driver newdriver=service.addnewDriver(driver);
			
			URI location=
					ServletUriComponentsBuilder
					.fromCurrentRequest().path("/{id}")
					.buildAndExpand(newdriver.getDriverId()).toUri();
			return ResponseEntity.created(location).build();
		}
		
	
		
		//find ride
		@GetMapping("/rides/{sourcex}/{sourcey}")
		public HashSet<Driver> find_rride(@PathVariable int sourcex,@PathVariable int sourcey)
		{
			return service.find_ride(sourcex,sourcey);
				
		}
		
		
}
