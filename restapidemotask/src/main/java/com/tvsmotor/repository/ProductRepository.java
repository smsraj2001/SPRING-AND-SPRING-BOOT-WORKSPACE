package com.tvsmotor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tvsmotor.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>  
{

}
