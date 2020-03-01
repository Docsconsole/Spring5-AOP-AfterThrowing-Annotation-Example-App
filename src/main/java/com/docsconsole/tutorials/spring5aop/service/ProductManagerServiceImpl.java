package com.docsconsole.tutorials.spring5aop.service;

import java.util.ArrayList;
import java.util.List;

import com.docsconsole.tutorials.spring5aop.entity.Product;

public class ProductManagerServiceImpl implements ProductManagerService {
	
	public Product getProductById(Integer productId) {
		
		System.out.println("Method getProductById() called");
		return new Product(1002,"Product2");
	}

	public List<Product> getAllProducts() {
		
		System.out.println("Method getAllProducts() called");
		return new ArrayList<Product>();
	}

	public void createProduct(Product product) {
		
		System.out.println("Method createProduct() called");
	}

	public void deleteProduct(Integer productId) {
		
		System.out.println("Method deleteProduct() called");
	}

	public void updateProduct(Product product) {
		
		System.out.println("Method updateProduct() called");
	}
}