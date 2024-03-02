package com.javatechie.redis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.javatechie.redis.entity.Product;
import com.javatechie.redis.respository.ProductDao;
@Service
@Transactional
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductDao dao;
	@Override
	public List<Product> findAll() {
		return dao.findAll();
	}

	@Override
	public Product save(Product product) {
		return dao.save(product);
	}

	@Override
	public Product findProductById(int id) {
		return dao.findProductById(id);
	}

	@Override
	public String delete(int id) {
		return dao.delete(id);
	}

}
