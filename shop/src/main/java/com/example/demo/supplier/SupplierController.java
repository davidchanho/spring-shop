package com.example.demo.supplier;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@Tag(name = "Supplier")
@RequestMapping("/suppliers")
@CrossOrigin(origins = "*")
public class SupplierController {
	
	SupplierService supplierService;
	
	@GetMapping
	public ResponseEntity<List<Supplier>> getSuppliers() {
		return new ResponseEntity<>(supplierService.getSuppliers(), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Supplier> getSupplier(Long id) {
		return new ResponseEntity<>(supplierService.getSupplier(id), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Supplier> saveSupplier(Supplier supplier) {
		return new ResponseEntity<>(supplierService.saveSupplier(supplier), HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{id}")
	public  ResponseEntity<HttpStatus> deleteSupplier(Long id) {
		supplierService.deleteSupplier(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
}
