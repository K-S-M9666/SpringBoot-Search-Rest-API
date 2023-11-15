package net.javaguides.springboot.service;

import java.util.List;

import net.javaguides.springboot.entity.Product;

public interface ProductService {

	List<Product> searchProducts(String query);

	Product createProduct(Product product);
	
}
