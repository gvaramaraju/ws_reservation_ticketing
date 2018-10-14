package com.reservation.application.entities;

import java.time.OffsetDateTime;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Ticket {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private Integer pnrNumber;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "passengers")
	private List<Passenger> passengers;
	private String status;
	@OneToOne
	@JoinColumn(name = "trainNumber")
	private Train trainNumber;
	private Date travelDate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPnrNumber() {
		return pnrNumber;
	}

	public void setPnrNumber(Integer pnrNumber) {
		this.pnrNumber = pnrNumber;
	}

	public List<Passenger> getPassengers() {
		return passengers;
	}

	public void setPassengers(List<Passenger> passengers) {
		this.passengers = passengers;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Train getTrainNumber() {
		return trainNumber;
	}

	public void setTrainNumber(Train trainNumber) {
		this.trainNumber = trainNumber;
	}

	public Date getTravelDate() {
		return travelDate;
	}

	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}

}
