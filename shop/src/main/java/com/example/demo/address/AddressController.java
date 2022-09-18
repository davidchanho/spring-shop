package com.example.demo.address;

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
@RequestMapping("/addresses")
@Tag(name = "Addresses")
@CrossOrigin(origins = "*")
public class AddressController {
	
	AddressService addressService;

    @GetMapping("/{id}")
    public ResponseEntity<Address> getAddress(@PathVariable Long id) {
        return new ResponseEntity<>(addressService.getAddress(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Address> saveAddress(@RequestBody Address address) {
        return new ResponseEntity<>(addressService.saveAddress(address), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteAddress(@PathVariable Long id) {
    	addressService.deleteAddress(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping
    public ResponseEntity<List<Address>> getAddresses() {
        return new ResponseEntity<>(addressService.getAddresses(), HttpStatus.OK);
    }
}
