package com.reservation.application.dto;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

public class UserLoginDTO implements Serializable {

	private static final long serialVersionUID = -8039993325859903990L;
	@NotNull
	private String userName;
	@NotNull
	private String password;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
