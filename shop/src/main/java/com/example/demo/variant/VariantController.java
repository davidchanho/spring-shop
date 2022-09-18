package com.example.demo.variant;

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
@RequestMapping("/variants")
@Tag(name = "Variants")
@CrossOrigin(origins = "*")
public class VariantController {
	
	VariantService variantService;

    @GetMapping("/{id}")
    public ResponseEntity<Variant> getVariant(@PathVariable Long id) {
        return new ResponseEntity<>(variantService.getVariant(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Variant> saveVariant(@RequestBody Variant variant) {
        return new ResponseEntity<>(variantService.saveVariant(variant), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteVariant(@PathVariable Long id) {
    	variantService.deleteVariant(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping
    public ResponseEntity<List<Variant>> getVariants() {
        return new ResponseEntity<>(variantService.getVariants(), HttpStatus.OK);
    }
	
}
