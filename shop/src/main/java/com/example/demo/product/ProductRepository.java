package com.example.demo.product;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


public interface ProductRepository extends CrudRepository<Product, Long> {
	
	public List<Product> getProductsByCategory(Long categoryId);
	public List<Product> getProductsByDiscount(Long discountId);
	public List<Product> getProductsBySupplier(Long supplierId);
	
}
