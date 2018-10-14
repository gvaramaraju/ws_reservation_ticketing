package com.reservation.application.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.reservation.application.dto.TicketDTO;
import com.reservation.application.entities.Ticket;
import com.reservation.application.service.TicketService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class TicketController {

	private TicketService ticketService;

	public TicketController(TicketService ticketService) {
		this.ticketService = ticketService;
	}

	@PostMapping("/user/addticket")
	public Ticket addTicket(@RequestBody TicketDTO ticketDto) {
		return ticketService.addTicket(ticketDto);
	}

}
