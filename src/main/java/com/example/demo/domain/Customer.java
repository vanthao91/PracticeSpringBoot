package com.example.demo.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.example.demo.enumaric.GenderEnum;

@Entity
@lombok.Getter
@lombok.Setter
public class Customer extends Person {
	
	@ManyToOne
	@JoinColumn (name = "building_Id")
	private Building building;
	
	@ManyToOne
	@JoinColumn (name = "block_Id")
	private Block block;
	
	@ManyToOne
	@JoinColumn (name = "apartment_Id")
	private Apartment apartment;

	public Customer(String firstName, String lastName, GenderEnum gender, Date DOB, Building building, Block block, Apartment apartment) {
		super(firstName, lastName, gender, DOB);
		this.building = building;
		this.block = block;
		this.apartment = apartment;
	}
}
