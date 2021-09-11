package com.product.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.product.impl.ServiceImplementation;
import com.product.model.Product;
import com.product.repository.ProductRepository;

@RestController
public class ProductController {

	@Autowired
	ServiceImplementation serviceImplementation;
	
	@GetMapping("/test")
	public String test(){
		return "Welcome to spring boot tutorial";
	}
	
	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product product){
		return serviceImplementation.addProduct(product);
	}

	@GetMapping("/getAllProduct")
	public List<Product> getAllProduct(){
		
		return serviceImplementation.getAllProduct();
	}
	
	@GetMapping("/getProductById/{id}")
	public Product getProductById(@PathVariable String id){
		return serviceImplementation.getProductById(id);
	}
	
	@GetMapping("/getProductByName/{name}")
	public Product getProductByName(@PathVariable String name)
	{
		return serviceImplementation.getProductByName(name);
	}
	
	@PutMapping("/updateProduct")
	public Product updateProduct(@RequestBody Product product)
	{		
		return serviceImplementation.updateProduct(product);
	}
	
	@DeleteMapping("/deleteProduct/{id}")
	public String deleteProduct(@PathVariable String id)
	{
		return serviceImplementation.deleteProduct(id);
	}
}
