package com.javatechie.redis.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.javatechie.redis.entity.Product;
@Service
public interface ProductService {
	public List<Product> findAll();
	public Product save(Product product);
	public Product findProductById(int id);
	public String delete(int id);
}
