package com.example.demo.address;

import java.util.List;


public interface AddressService {
	List<Address> getAddresses();
	Address getAddress(Long id);
	Address saveAddress(Address address);
	void deleteAddress(Long id);
}
