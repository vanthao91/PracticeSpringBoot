package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@lombok.Getter
@lombok.Setter
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotBlank
	private String street;
	
	private String unit;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name = "city_Id")
	private City city;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name = "state_Id")
	private State state;
	
	@NotBlank
	private String zipCode;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}
}
