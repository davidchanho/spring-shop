package com.example.demo.address;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class AddressServiceImpl implements AddressService {
	
	AddressRepository addressRepository;
	
	@Override
	public List<Address> getAddresses() {
		return (List<Address>) addressRepository.findAll();
	}

	@Override
	public Address getAddress(Long id) {
		return addressRepository.findById(id).get();
	}

	@Override
	public Address saveAddress(Address address) {
		return addressRepository.save(address);
	}

	@Override
	public void deleteAddress(Long id) {
		addressRepository.deleteById(id);
	}

}
