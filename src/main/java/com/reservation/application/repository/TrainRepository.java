package com.reservation.application.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.reservation.application.entities.Station;
import com.reservation.application.entities.Train;

@Repository
public interface TrainRepository extends JpaRepository<Train, Integer> {
	Train findByTrainId(String trainId);

	List<Train> findBySourceStationAndDestinationStation(Station sourceStation, Station destinationStation);
}
