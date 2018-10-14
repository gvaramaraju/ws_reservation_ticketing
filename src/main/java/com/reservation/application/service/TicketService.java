package com.reservation.application.service;

import java.util.Random;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.reservation.application.dto.PassengerDTO;
import com.reservation.application.dto.TicketDTO;
import com.reservation.application.entities.Passenger;
import com.reservation.application.entities.Ticket;
import com.reservation.application.repository.TicketRepository;
import com.reservation.application.repository.TrainRepository;

@Service
@Transactional
public class TicketService {

	private TicketRepository ticketRepository;
	private TrainRepository trainRepository;

	public TicketService(TicketRepository ticketRepository, TrainRepository trainRepository) {
		this.ticketRepository = ticketRepository;
		this.trainRepository = trainRepository;
	}

	public Ticket addTicket(TicketDTO ticketDto) {
		Ticket ticket = mapToTicket(ticketDto);
		return ticketRepository.save(ticket);
	}

	private Ticket mapToTicket(TicketDTO ticketDto) {
		Ticket ticket = new Ticket();
		ticket.setPnrNumber(getRandomNumberInRange(1000, 2000));
		ticket.setPassengers(
				ticketDto.getPassengerDtos().stream().map(this::mapToPassenger).collect(Collectors.toList()));
		ticket.setStatus("Confirmed");
		ticket.setTrainNumber(trainRepository.findByTrainId(ticketDto.getTrainNumber()));
		ticket.setTravelDate(ticketDto.getTravelDate());
		return ticket;
	}

	private Passenger mapToPassenger(PassengerDTO passengerDto) {
		Passenger passenger = new Passenger();
		passenger.setName(passengerDto.getName());
		passenger.setAge(passengerDto.getAge());
		passenger.setGender(passengerDto.getGender());
		return passenger;
	}

	private static int getRandomNumberInRange(int min, int max) {
		Random r = new Random();
		return r.ints(min, (max + 1)).findFirst().getAsInt();

	}
}
