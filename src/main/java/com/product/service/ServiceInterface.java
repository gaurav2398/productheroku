package com.product.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.product.model.Product;

public interface ServiceInterface {

	public Product addProduct(Product product);
	public List<Product> getAllProduct();
	public Product getProductById(String id);
	public Product getProductByName(String name);
	public Product updateProduct(Product product);
	public String deleteProduct(String id);
}
