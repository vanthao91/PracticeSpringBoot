package com.example.demo.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;

@Entity
@lombok.Getter
@lombok.Setter
public class Building {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotBlank
	private String name;
	
	@OneToOne
	@JoinColumn(name = "address_Id")
	private Address address;
	
	@ManyToOne
	@JoinColumn(name = "company_Id")
	private Company company;
	
	private String phone;
	
	private String fax;

	@OneToMany(mappedBy = "building", cascade = CascadeType.ALL)
	private List<Block> blocks;
}
