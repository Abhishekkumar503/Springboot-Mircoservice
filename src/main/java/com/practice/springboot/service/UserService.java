package com.practice.springboot.service;

import java.util.List;

import com.practice.springboot.dto.UserDto;
import com.practice.springboot.entity.User;

public interface UserService {
	UserDto createUser(UserDto user);

    UserDto getUserById(Long userId);

    List<UserDto> getAllUsers();

    UserDto updateUser(UserDto user);

    void deleteUser(Long userId);
}