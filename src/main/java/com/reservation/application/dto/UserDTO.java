	package com.reservation.application.dto;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

public class UserDTO implements Serializable {

	private static final long serialVersionUID = 5006356989127432535L;
	@NotNull
	private String userName;
	@NotNull
	private String password;
	@NotNull
	private String email;
	@NotNull
	private String phoneNumber;
	@NotNull
	private String billingAddress;
	@NotNull
	private Integer age;
	@NotNull
	private String gender;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
