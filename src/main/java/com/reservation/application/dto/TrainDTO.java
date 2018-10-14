package com.reservation.application.dto;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

public class TrainDTO implements Serializable {

	private static final long serialVersionUID = 6944980497286469705L;
	@NotNull
	private String trainId;
	@NotNull
	private String trainName;
	@NotNull
	private String sourceStation;
	@NotNull
	private String destinationStation;
	@NotNull
	private String startTime;
	@NotNull
	private String endTime;
	@NotNull
	private String trainType;

	public String getTrainId() {
		return trainId;
	}

	public void setTrainId(String trainId) {
		this.trainId = trainId;
	}

	public String getTrainName() {
		return trainName;
	}

	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}

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

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getTrainType() {
		return trainType;
	}

	public void setTrainType(String trainType) {
		this.trainType = trainType;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
