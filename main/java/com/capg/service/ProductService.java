package com.capg.service;

import java.util.List; 

import com.capg.entity.Product;

public interface ProductService {
	
	public Product addProduct(Product product);
	public List<Product> getAllProduct();
	public Product getProductById(int id);

}
