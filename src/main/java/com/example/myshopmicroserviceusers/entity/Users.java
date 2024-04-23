package com.example.myshopmicroserviceusers.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Users {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int UserId;
	
//	@OneToMany(mappedBy="userId",cascade= CascadeType.ALL)
//	private List<Integer> orderId;
//	
	private String name;
	private String password;
	private String address;
	private String state;
	private String country;
}
