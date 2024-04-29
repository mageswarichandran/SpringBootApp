package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.dao.ProductRepository;
import com.example.demo.entity.Product;

public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductRepository repo;
	
	@Override
	public Product add(Product product) {
		return repo.save(product);
		
	}

	@Override
	public Product update(Product product) {
		return repo.save(product);
		
	}

	@Override
	public List<Product> get() {
		return (List<Product>) repo.findAll();
	}

	@Override
	public void remove(Integer id) {
		repo.deleteById(id);
		
	}

}
