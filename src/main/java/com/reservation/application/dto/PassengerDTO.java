package com.reservation.application.dto;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

public class PassengerDTO implements Serializable {

	private static final long serialVersionUID = 1091131729008720194L;
	@NotNull
	private String name;
	@NotNull
	private String gender;
	@NotNull
	private Integer age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
