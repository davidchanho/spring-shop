package com.example.demo.discount;

import java.util.List;

public interface DiscountService {
	List<Discount> getDiscounts();
	Discount getDiscount(Long id);
	Discount saveDiscount(Discount discount);
	void deleteDiscount(Long id);
}
