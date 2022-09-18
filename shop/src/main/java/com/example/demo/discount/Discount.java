package com.example.demo.discount;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.example.demo.product.Product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "discount")
public class Discount {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Column(name = "name", nullable = false)
	private String name;
	
	@NotNull
	@Column(name = "description", nullable = false)
	private String description;
	
	@NotNull
	@Column(name = "percentage", nullable = false)
	private float percentage;
	
	@NotNull
	@Column(name = "active", nullable = false)
	private Boolean active;

	@OneToMany(mappedBy = "discount")
	private List<Product> products;
	
	public void addProduct(Product product) {
		this.products.add(product);
	}
	
}
