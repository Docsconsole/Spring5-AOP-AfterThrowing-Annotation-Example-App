package com.docsconsole.tutorials.spring5aop.mainclient;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.docsconsole.tutorials.spring5aop.entity.Product;
import com.docsconsole.tutorials.spring5aop.service.ProductManagerService;

public class MainClientForTesting {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ProductManagerService manager = (ProductManagerService) context.getBean("productManagerService");

		manager.getProductById(1);
		manager.createProduct(new Product(1001,"Product1"));
	}
}