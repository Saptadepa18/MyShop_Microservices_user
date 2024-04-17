package com.example.myshopmicroserviceusers.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.myshopmicroserviceusers.entity.Users;
import com.example.myshopmicroserviceusers.service.UserService;

@RestController
@CrossOrigin(origins="http://localhost:3000",allowedHeaders="*")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/create-user")
	public Users createUser(@RequestBody Users u)
	{
		return userService.createUser(u);
	}
	
	@PutMapping("/update-user/{id}")
	public Users updateUser(@PathVariable int id,@RequestBody Users u)
	{
		return userService.updateUser(id, u);
	}
	
	@GetMapping("get-users/{id}")
	public Users getUsersById(@PathVariable int id)
	{
		return userService.getUserById(id);
	}
	
	@DeleteMapping("delete-user/{id}")
	public Users deleteUser(@PathVariable int id)
	{
		return userService.deleteUser(id);
	}
}
