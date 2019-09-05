package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;

@Entity
@lombok.Getter
@lombok.Setter
public class City {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotBlank
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "state_Id")
	private State state;
	
	private City() {
		// TODO Auto-generated constructor stub
	}
	
	public City(String name, State state) {
		this.name = name;
		this.state = state;
	}
}
