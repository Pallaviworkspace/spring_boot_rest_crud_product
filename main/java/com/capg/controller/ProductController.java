package com.capg.controller;
import java.util.List; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.capg.entity.Product;
import com.capg.service.ProductService;

@RestController
@RequestMapping("api/v1")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@PostMapping("/product")
	public Product addProduct(@RequestBody Product product)
	{
		return  productService.addProduct(product);
	}
	
	
	@GetMapping("/products")
	public List<Product> getAllProduct() 
	{
		return productService.getAllProduct();
	}
	
	@GetMapping("/product/{id}")
	public Product getProductById(@PathVariable int id)
	{
		return productService.getProductById(id);
	}

}
