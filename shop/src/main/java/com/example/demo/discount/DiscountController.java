package com.example.demo.discount;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/discounts")
@Tag(name = "Discounts")
@CrossOrigin(origins = "*")
public class DiscountController {
	
	DiscountService discountService;

    @GetMapping("/{id}")
    public ResponseEntity<Discount> getDiscount(@PathVariable Long id) {
        return new ResponseEntity<>(discountService.getDiscount(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Discount> saveDiscount(@RequestBody Discount discount) {
        return new ResponseEntity<>(discountService.saveDiscount(discount), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteDiscount(@PathVariable Long id) {
    	discountService.deleteDiscount(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping
    public ResponseEntity<List<Discount>> getDiscounts() {
        return new ResponseEntity<>(discountService.getDiscounts(), HttpStatus.OK);
    }
	
}
