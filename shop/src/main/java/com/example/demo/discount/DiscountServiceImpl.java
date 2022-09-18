package com.example.demo.discount;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class DiscountServiceImpl implements DiscountService {
	
	DiscountRepository discountRepository;
	
	@Override
	public List<Discount> getDiscounts() {
		return (List<Discount>) discountRepository.findAll();
	}

	@Override
	public Discount getDiscount(Long id) {
		return discountRepository.findById(id).get();
	}

	@Override
	public Discount saveDiscount(Discount discount) {
		return discountRepository.save(discount);
	}

	@Override
	public void deleteDiscount(Long id) {
		discountRepository.deleteById(id);
	}

}
