package com.example.demo.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;

@Entity
@lombok.Setter
@lombok.Getter
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotBlank
	private String username;
	
	@NotBlank
	private String password;
	
	private boolean active;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "person_Id")
	private Person person;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
	private List<Role> roles;
	
	private User() {
		// TODO Auto-generated constructor stub
	}

	private User(String username, String password, Person person) {
		this.username = username;
		this.password = password;
		this.person = person;
		this.active = true;
	}
}
