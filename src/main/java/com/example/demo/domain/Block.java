package com.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Entity
@lombok.Getter
@lombok.Setter
public class Block {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotBlank
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "building_Id")
	private Building building;
	
	@OneToMany (mappedBy = "block", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("block")
	private List<Apartment> apartments;
	
	@Min(value = 0)
	private int noOfApt;
	
	@Min(value = 0)
	private int noOfFloor;
}
