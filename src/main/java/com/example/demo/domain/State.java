package com.example.demo.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.validator.constraints.UniqueElements;

@Entity
@lombok.Getter
@lombok.Setter
public class State {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<City> getCities() {
		return cities;
	}

	public void setCities(List<City> cities) {
		this.cities = cities;
	}

	@NotBlank
	@UniqueElements
	private String shortName;
	
	@NotBlank
	@UniqueElements
	private String name;
	
	@OneToMany (mappedBy = "state", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("state")
	private List<City> cities;

	@Override
	public String toString() {
		return "State{" +
				"id=" + id +
				", shortName='" + shortName + '\'' +
				", name='" + name + '\'' +
				", cities=" + cities +
				'}';
	}
}
