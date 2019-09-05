package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.UniqueElements;

@Entity
@lombok.Getter
@lombok.Setter
public class Company {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotBlank
	@UniqueElements
	private String name;
	
	@OneToOne
	@JoinColumn(name = "address_Id")
	private Address address;
	
	private boolean mainCompany;
	
	private Company() {
		// TODO Auto-generated constructor stub
	}
	
	public Company(String name) {
		this.name = name;
		this.address = new Address();
		this.mainCompany = false;
	}
}
