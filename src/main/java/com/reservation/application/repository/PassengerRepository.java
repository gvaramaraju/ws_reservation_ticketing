package com.reservation.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.reservation.application.entities.Passenger;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger, Integer>{

}
