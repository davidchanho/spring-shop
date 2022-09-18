package com.example.demo.supplier;

import java.util.List;

public interface SupplierService {
	Supplier getSupplier(Long id);
	List<Supplier> getSuppliers();
	Supplier saveSupplier(Supplier supplier);
	void deleteSupplier(Long id);
}
