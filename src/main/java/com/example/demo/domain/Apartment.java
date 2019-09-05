package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Entity
@lombok.Getter
@lombok.Setter
public class Apartment {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotBlank
	private String aptNo;
	
	@Min(0)
	private int square;
	
	@Min(1)
	private int bedRoom;
	
	@Min(1)
	private int bathRoom;
	
	@ManyToOne
	@JoinColumn (name = "block_Id")
	private Block block;
}
