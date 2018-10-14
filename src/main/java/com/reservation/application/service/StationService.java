package com.reservation.application.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.reservation.application.dto.StationDTO;
import com.reservation.application.entities.Station;
import com.reservation.application.repository.StationRepository;

@Service
@Transactional
public class StationService {

	private StationRepository stationRepository;

	public StationService(StationRepository stationRepository) {
		this.stationRepository = stationRepository;
	}

	public Station addStation(StationDTO stationDto) {
		Station station = mapToStation(stationDto);
		return stationRepository.save(station);
	}

	private Station mapToStation(StationDTO stationDto) {
		Station station = new Station();
		station.setCode(stationDto.getCode());
		station.setStationName(stationDto.getStationName());
		return station;
	}

}
