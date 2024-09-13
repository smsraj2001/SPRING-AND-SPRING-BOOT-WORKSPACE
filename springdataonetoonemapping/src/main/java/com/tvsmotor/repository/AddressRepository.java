package com.tvsmotor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tvsmotor.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> 
{

}
