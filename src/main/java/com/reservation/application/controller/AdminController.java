package com.reservation.application.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.reservation.application.dto.StationDTO;
import com.reservation.application.dto.TrainDTO;
import com.reservation.application.dto.UserDTO;
import com.reservation.application.entities.Station;
import com.reservation.application.entities.Train;
import com.reservation.application.entities.User;
import com.reservation.application.service.AdminService;
import com.reservation.application.service.StationService;
import com.reservation.application.service.TrainService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class AdminController {

	private AdminService adminService;
	private TrainService trainService;
	private StationService stationService;

	public AdminController(AdminService adminService, TrainService trainService, StationService stationService) {
		this.adminService = adminService;
		this.trainService = trainService;
		this.stationService = stationService;
	}

	@PostMapping("/admin/addadmin")
	public User addAdmin(@RequestBody UserDTO userDto) {
		User user = adminService.addAdmin(userDto);
		return user;
	}

	@PostMapping("/admin/addtrain")
	public Train addTrain(@RequestBody TrainDTO trainDto) {
		Train train = trainService.addTrain(trainDto);
		return train;
	}

	@PostMapping("/admin/addstation")
	public Station addStation(@RequestBody StationDTO stationDto) {
		Station station = stationService.addStation(stationDto);
		return station;
	}
}
