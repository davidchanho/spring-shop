package com.example.demo.variant;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class VariantServiceImpl implements VariantService {
	
	VariantRepository variantRepository;
	
	@Override
	public List<Variant> getVariants() {
		return (List<Variant>) variantRepository.findAll();
	}

	@Override
	public Variant getVariant(Long id) {
		return variantRepository.findById(id).get();
	}

	@Override
	public Variant saveVariant(Variant variant) {
		return variantRepository.save(variant);
	}

	@Override
	public void deleteVariant(Long id) {
		variantRepository.deleteById(id);
	}

}
