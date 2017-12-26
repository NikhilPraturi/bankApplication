package com.example.service;

import com.example.model.User;

public interface UserService {

	public User findByEmail(String email);
	public void saveUser(User user);
}
