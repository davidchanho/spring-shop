package com.example.demo.category;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class CategoryServiceImpl implements CategoryService {
	
	CategoryRepository categoryRepository;
	
	@Override
	public List<Category> getCategories() {
		return (List<Category>) categoryRepository.findAll();
	}

	@Override
	public Category getCategory(Long id) {
		return categoryRepository.findById(id).get();
	}

	@Override
	public Category saveCategory(Category category) {
		return categoryRepository.save(category);
	}

	@Override
	public void deleteCategory(Long id) {
		categoryRepository.deleteById(id);
	}

}
