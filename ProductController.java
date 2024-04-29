package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	
	 @PostMapping("/products")
	    public String addProduct(@RequestBody Product product) {
		 service.add(product);
	        return "Product added: " + product;
	    }
	 
	@GetMapping("/products")
    public List<Product> getProduct() {
		List<Product> list = service.get();
        return list;
    }
	 
	@PutMapping("/products")
    public String updateProduct(@RequestBody Product product) {
       service.update(product);
       return  return "Product updated: " + product;
    } 
	
	
	@DeleteMapping("/product/{productId}")
    public String deleteMessage(@PathVariable int productId) {
       
           service.remove(productId);
            return "Product removed";
        } 
    }

}
