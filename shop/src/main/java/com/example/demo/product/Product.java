package com.example.demo.product;


import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.example.demo.category.Category;
import com.example.demo.discount.Discount;
import com.example.demo.supplier.Supplier;
import com.example.demo.variant.Variant;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "product")
public class Product {
	
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
	@Column(name = "price", nullable = false)
	private BigDecimal price;
	
	@NotNull
	@Column(name = "quantity", nullable = false)
	private int quantity;
	
	@NotNull
	@Column(name = "sku", nullable = false)
	private String sku;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "category_id", referencedColumnName = "id")
	private Category category;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "discount_id", referencedColumnName = "id")
	private Discount discount;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "supplier_id", referencedColumnName = "id")
	private Supplier supplier;
	
	@OneToMany(mappedBy = "product")
	private List<Variant> variants;
	
}
