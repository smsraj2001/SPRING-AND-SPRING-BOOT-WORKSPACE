package com.tvsmotor.controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tvsmotor.entity.Product;
import com.tvsmotor.repository.ProductRepository;

@RequestMapping("/api/v1")
@RestController
public class ProductController {
	
	@Autowired
	ProductRepository productRepository;
	
	@PostMapping("/product")
	public Product addProduct(@RequestBody Product product)
	{
		product.setManufacturingDate(LocalDate.now());
		return productRepository.save(product);
	}
	
	@GetMapping("/product")
	public List<Product> getProduct()
	{
		return productRepository.findAll();
	}
	
	@GetMapping("/product/{id}")
	public Product getProduct(@PathVariable int id)
	{
		return productRepository.findById(id).get();
	}
	
	@DeleteMapping("/product/{id}")
	public String deleteByEmployeeId(@PathVariable int id)
	{
		productRepository.deleteById(id);
		return "Product deleted with id: " + id;		
	}
	
	@PutMapping("/employee/{id}")
	public Product updateEmployeeById(@PathVariable int id, @RequestBody Product product)
	{
		Optional<Product> product2 = productRepository.findById(id);
		Product updatedEmp = null;
		if(product2.isPresent())
		{
			updatedEmp = product2.get();
			updatedEmp.setName(product.getName());
			updatedEmp.setManufacturingDate(product.getManufacturingDate());
			updatedEmp.setPrice(product.getPrice());
			productRepository.save(updatedEmp);
		}
		return updatedEmp;		
	}
}