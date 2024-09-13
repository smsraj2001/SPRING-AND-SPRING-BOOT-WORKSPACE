package com.tvsmotor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tvsmotor.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> 
{

}
