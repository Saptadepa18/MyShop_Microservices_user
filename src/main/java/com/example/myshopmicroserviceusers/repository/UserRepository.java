package com.example.myshopmicroserviceusers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.myshopmicroserviceusers.entity.Users;

@Repository
public interface UserRepository extends JpaRepository<Users,Integer>{

}
