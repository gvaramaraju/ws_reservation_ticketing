package com.reservation.application.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.reservation.application.dto.UserDTO;
import com.reservation.application.entities.User;
import com.reservation.application.repository.UserRepository;

@Service
@Transactional
public class AdminService {

	private static final String ADMIN = "Admin";
	private UserRepository userRepository;

	public AdminService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public User addAdmin(UserDTO userDto) {
		User user = mapToUser(userDto);
		return userRepository.save(user);
	}

	private User mapToUser(UserDTO userDto) {
		User user = new User();
		user.setUserName(userDto.getUserName());
		user.setPassword(userDto.getPassword());
		user.setEmail(userDto.getEmail());
		user.setPhoneNumber(userDto.getPhoneNumber());
		user.setBillingAddress(userDto.getBillingAddress());
		user.setAge(userDto.getAge());
		user.setGender(userDto.getGender());
		user.setRole(ADMIN);
		return user;
	}
}
