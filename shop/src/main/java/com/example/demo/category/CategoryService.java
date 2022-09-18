package com.example.demo.category;

import java.util.List;

public interface CategoryService {
	List<Category> getCategories();
	Category getCategory(Long id);
	Category saveCategory(Category category);
	void deleteCategory(Long id);
}
