package com.example.demo.variant;

import java.util.List;

public interface VariantService {
	List<Variant> getVariants();
	Variant getVariant(Long id);
	Variant saveVariant(Variant variant);
	void deleteVariant(Long id);
}
