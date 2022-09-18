package com.example.demo.product;

import java.util.List;

public interface ProductService {
	List<Product> getProducts();
	Product getProduct(Long id);
	Product saveProduct(Product product);
	void deleteProduct(Long id);
	List<Product> getProductsByCategory(Long categoryId);
	List<Product> getProductsByDiscount(Long discountId);
	List<Product> getProductsBySupplier(Long supplierId);
}
