package com.reservation.application.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.reservation.application.dto.SearchTrainDTO;
import com.reservation.application.entities.Train;
import com.reservation.application.service.TrainService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class TrainController {

	public TrainController(TrainService trainService) {
		this.trainService = trainService;
	}

	private TrainService trainService;

	@PostMapping("/user/searchtrain")
	public List<Train> getTrains(@RequestBody SearchTrainDTO searchTrainDto) {
		return trainService.getTrains(searchTrainDto);

	}

}
