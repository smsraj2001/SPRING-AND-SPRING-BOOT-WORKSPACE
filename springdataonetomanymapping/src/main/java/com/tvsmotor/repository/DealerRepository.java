package com.tvsmotor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tvsmotor.entity.Dealer;

public interface DealerRepository extends JpaRepository<Dealer, Integer> 
{

}
