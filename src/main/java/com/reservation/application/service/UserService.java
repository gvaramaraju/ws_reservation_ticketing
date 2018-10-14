package com.reservation.application.service;

import javax.transaction.Transactional;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import com.reservation.application.dto.UserDTO;
import com.reservation.application.dto.UserLoginDTO;
import com.reservation.application.entities.User;
import com.reservation.application.repository.UserRepository;

@Service
@Transactional
public class UserService {

	private static final String USER = "User";
	private final UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public User addUser(UserDTO userDto) {
		User user = mapToUser(userDto);
		return userRepository.save(user);

	}

	public User findUser(UserLoginDTO userLoginDto) {
		User user = userRepository.findByUserName(userLoginDto.getUserName());
		if (!user.getPassword().equals(userLoginDto.getPassword())) {
			throw new HttpClientErrorException(HttpStatus.UNAUTHORIZED);
		}
		return user;

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
		user.setRole(USER);
		return user;
	}

}
