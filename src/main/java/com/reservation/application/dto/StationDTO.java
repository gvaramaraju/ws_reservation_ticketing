package com.reservation.application.dto;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

public class StationDTO implements Serializable {

	private static final long serialVersionUID = 4046064346701804145L;
	@NotNull
	private String code;
	@NotNull
	private String stationName;

	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getStationName() {
		return stationName;
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
