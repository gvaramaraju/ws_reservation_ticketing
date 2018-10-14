package com.reservation.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.reservation.application.entities.Ticket;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Integer> {

}
