package com.javatechie.redis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javatechie.redis.entity.Product;
import com.javatechie.redis.service.ProductService;
@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
    private ProductService dao;

    @PostMapping("/save")
    public Product save(@RequestBody Product product) {
        return dao.save(product);
    }

    @GetMapping("/findAll")
    public List<Product> getAllProducts() {
        return dao.findAll();
    }

    @GetMapping("findProductById/{id}")
    public Product findProduct(@PathVariable int id) {
        return dao.findProductById(id);
    }
    @DeleteMapping("delete/{id}")
    public String remove(@PathVariable int id)   {
    	return dao.delete(id);
	}
}
