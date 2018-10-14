package com.reservation.application.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.reservation.application.dto.UserDTO;
import com.reservation.application.dto.UserLoginDTO;
import com.reservation.application.entities.User;
import com.reservation.application.service.UserService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

	private final UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

	@PostMapping("/user/adduser")
	public User addUser(@RequestBody UserDTO userDto) {
		User user = userService.addUser(userDto);
		return user;
	}

	@PostMapping("/user/authenthicate")
	@CrossOrigin(origins = "http://localhost:4200")
	public User authenthicateUser(@RequestBody UserLoginDTO userLoginDto) {
		return userService.findUser(userLoginDto);
	}

}
