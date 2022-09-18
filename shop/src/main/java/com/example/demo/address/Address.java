package com.example.demo.address;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.example.demo.supplier.Supplier;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "address")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Column(name = "street1", nullable = false)
	private String street1;
	
	@NotNull
	@Column(name = "street2", nullable = false)
	private String street2;
	
	@NotNull
	@Column(name = "city", nullable = false)
	private String city;
	
	@NotNull
	@Column(name = "state", nullable = false)
	private String state;
	
	@NotNull
	@Length(min = 5, max = 5, message = "Zipcode must be exactly 5 characters")
	@Column(name = "zipcode", nullable = false)
	private String zipcode;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "supplier_id", referencedColumnName = "id")
	private Supplier supplier;

}
