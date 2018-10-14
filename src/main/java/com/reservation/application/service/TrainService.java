package com.reservation.application.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.reservation.application.dto.SearchTrainDTO;
import com.reservation.application.dto.TrainDTO;
import com.reservation.application.entities.Station;
import com.reservation.application.entities.Train;
import com.reservation.application.repository.StationRepository;
import com.reservation.application.repository.TrainRepository;

@Service
@Transactional
public class TrainService {

	private TrainRepository trainRepository;
	private StationRepository stationRepository;

	public TrainService(TrainRepository trainRepository, StationRepository stationRepository) {
		this.trainRepository = trainRepository;
		this.stationRepository = stationRepository;
	}

	public Train addTrain(TrainDTO trainDto) {
		Train train = mapToTrain(trainDto);
		return trainRepository.save(train);
	}

	public List<Train> getTrains(SearchTrainDTO searchTrainDto) {
		Station sourceStation = findStation(searchTrainDto.getSourceStation());
		Station destinationStation = findStation(searchTrainDto.getDestinationStation());
		return trainRepository.findBySourceStationAndDestinationStation(sourceStation, destinationStation);
	}

	private Train mapToTrain(TrainDTO trainDto) {
		Train train = new Train();
		train.setTrainId(trainDto.getTrainId());
		train.setTrainName(trainDto.getTrainName());
		train.setSourceStation(findStation(trainDto.getSourceStation()));
		train.setDestinationStation(findStation(trainDto.getDestinationStation()));
		train.setStartTime(trainDto.getStartTime());
		train.setEndTime(trainDto.getEndTime());
		train.setTrainType(trainDto.getTrainType());
		return train;
	}

	private Station findStation(String code) {
		return stationRepository.findByCode(code);
	}

}
