package com.product.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.model.Product;
import com.product.repository.ProductRepository;
import com.product.service.ServiceInterface;

@Service
public class ServiceImplementation implements ServiceInterface{

	@Autowired
	ProductRepository productRepository;
	
	@Override
	public Product addProduct(Product product) {
		return productRepository.save(product);
	}

	@Override
	public List<Product> getAllProduct() {
		List<Product> product = new ArrayList<Product>();
		productRepository.findAll().forEach(product::add);
		return product;
	}

	@Override
	public Product getProductById(String id) {
		return productRepository.findById(id).get();
	}

	@Override
	public Product getProductByName(String name) {

		return productRepository.findByName(name);
	}

	@Override
	public Product updateProduct(Product product) {
		Product existingProduct  = productRepository.findById(product.getId()).orElse(null);
		existingProduct.setName(product.getName());
		existingProduct.setCost(product.getCost());
		return productRepository.save(product);
	}

	@Override
	public String deleteProduct(String id) {
		productRepository.deleteById(id);
		return "Product with id : "+id+" is deleted successfully";
	}

}
