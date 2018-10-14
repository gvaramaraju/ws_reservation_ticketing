package com.reservation.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.reservation.application.entities.Station;

@Repository
public interface StationRepository extends JpaRepository<Station, Integer> {
	Station findByCode(String code);
}
