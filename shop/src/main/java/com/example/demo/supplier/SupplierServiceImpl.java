package com.example.demo.supplier;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class SupplierServiceImpl implements SupplierService {
	
	SupplierRepository supplierRepository;

	@Override
	public Supplier getSupplier(Long id) {
		return supplierRepository.findById(id).get();
	}

	@Override
	public List<Supplier> getSuppliers() {
		return (List<Supplier>) supplierRepository.findAll();
	}

	@Override
	public Supplier saveSupplier(Supplier supplier) {
		return supplierRepository.save(supplier);
	}

	@Override
	public void deleteSupplier(Long id) {
		supplierRepository.deleteById(id);
	}

}
