package com.example.demo.product;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.category.Category;
import com.example.demo.category.CategoryRepository;
import com.example.demo.discount.Discount;
import com.example.demo.discount.DiscountRepository;
import com.example.demo.supplier.Supplier;
import com.example.demo.supplier.SupplierRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class ProductServiceImpl implements ProductService {
	
	ProductRepository productRepository;
	
	CategoryRepository categoryRepository;
	
	DiscountRepository discountRepository;
	
	SupplierRepository supplierRepository;
	
	@Override
	public List<Product> getProducts() {
		return (List<Product>) productRepository.findAll();
	}

	@Override
	public Product getProduct(Long id) {
		return productRepository.findById(id).get();
	}

	@Override
	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}

	@Override
	public void deleteProduct(Long id) {
		productRepository.deleteById(id);
	}

	@Override
	public List<Product> getProductsByCategory(Long categoryId) {
		Category category = categoryRepository.findById(categoryId).get();
		return category.getProducts();
	}

	@Override
	public List<Product> getProductsByDiscount(Long discountId) {
		Discount discount = discountRepository.findById(discountId).get();
		return discount.getProducts();
	}
	
	@Override
	public List<Product> getProductsBySupplier(Long supplierId) {
		Supplier supplier = supplierRepository.findById(supplierId).get();
		return supplier.getProducts();
	}

}
