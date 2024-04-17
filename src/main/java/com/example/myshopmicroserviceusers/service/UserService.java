package com.example.myshopmicroserviceusers.service;

import com.example.myshopmicroserviceusers.entity.Users;

public interface UserService {
	
	public Users createUser(Users u);
	
	public Users updateUser(int id,Users updateUser);
	
	public Users getUserById(int id);
	
	public Users deleteUser(int id);

}
