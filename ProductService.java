package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Product;

public interface ProductService {

	public Product add(Product product);

	public Product update(Product product);

	public List<Product> get();
	
	public void remove(Integer id);

}
