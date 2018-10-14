package com.reservation.application.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reservation.application.entities.Station;
import com.reservation.application.repository.StationRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class StationController {
	
	private StationRepository stationRepostiory;
	
	public StationController(StationRepository stationRepostiory) {
		this.stationRepostiory = stationRepostiory;
	}
	
	@GetMapping("/user/stations")
	public List<Station> getStations(){
		return stationRepostiory.findAll();
	}
	

}
