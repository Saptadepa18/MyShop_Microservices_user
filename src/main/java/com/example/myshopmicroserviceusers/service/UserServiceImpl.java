package com.example.myshopmicroserviceusers.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.myshopmicroserviceusers.entity.Users;
import com.example.myshopmicroserviceusers.exception.NoUserFoundException;
import com.example.myshopmicroserviceusers.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepo;

	
	public Users createUser(Users u) {
		return userRepo.save(u);
	}


	public Users updateUser(int id, Users updateUser) {
		if(userRepo.existsById(id))
		{
			return userRepo.save(updateUser);
		}
		else
		{
			throw new NoUserFoundException("No User Found");
		}
	}


	public Users getUserById(int id) {
		if(userRepo.existsById(id))
		{
		return userRepo.findById(id).get();
		}
		else
		{
			throw new NoUserFoundException("No User Found");
		}
	}

	@Override
	public Users deleteUser(int id) {
		Optional<Users> productOptional = userRepo.findById(id);
	    if (productOptional.isPresent()) {
	    	Users productToDelete = productOptional.get();
	    	userRepo.delete(productToDelete);
	        return productToDelete;
	    } else {
	    	throw new NoUserFoundException("No User Found");
	}
	}
	
	
}
