package com.reservation.application.dto;

import java.io.Serializable;

public class SearchTrainDTO implements Serializable {

	private static final long serialVersionUID = 7347876777339488069L;
	
	private String sourceStation;
	
	private String destinationStation;

	public String getSourceStation() {
		return sourceStation;
	}

	public void setSourceStation(String sourceStation) {
		this.sourceStation = sourceStation;
	}

	public String getDestinationStation() {
		return destinationStation;
	}

	public void setDestinationStation(String destinationStation) {
		this.destinationStation = destinationStation;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
