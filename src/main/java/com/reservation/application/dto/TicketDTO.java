package com.reservation.application.dto;

import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class TicketDTO implements Serializable {

	private static final long serialVersionUID = -6251262481903402554L;
	@NotNull
	private Integer pnrNumber;
	@NotNull
	@Valid
	private List<PassengerDTO> passengerDtos;
	@NotNull
	private String status;
	@NotNull
	private String trainNumber;
	@NotNull
	private Date travelDate;

	public Integer getPnrNumber() {
		return pnrNumber;
	}

	public void setPnrNumber(Integer pnrNumber) {
		this.pnrNumber = pnrNumber;
	}

	public List<PassengerDTO> getPassengerDtos() {
		return passengerDtos;
	}

	public void setPassengerDtos(List<PassengerDTO> passengerDtos) {
		this.passengerDtos = passengerDtos;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTrainNumber() {
		return trainNumber;
	}

	public void setTrainNumber(String trainNumber) {
		this.trainNumber = trainNumber;
	}

	public Date getTravelDate() {
		return travelDate;
	}

	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
