package com.docsconsole.tutorials.spring5aop.service;

import java.util.List;

import com.docsconsole.tutorials.spring5aop.entity.Product;


public interface ProductManagerService {
	
	public Product getProductById(Integer productId);

	public List<Product> getAllProducts();

	public void createProduct(Product product);

	public void deleteProduct(Integer productId);

	public void updateProduct(Product product);
	
}