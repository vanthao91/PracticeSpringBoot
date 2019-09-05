package com.example.demo.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;

import org.springframework.format.annotation.DateTimeFormat;

import com.example.demo.enumaric.GenderEnum;

@Entity
@lombok.Getter
@lombok.Setter
@Inheritance(strategy = InheritanceType.JOINED)
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotBlank
	private String firstName;
	@NotBlank
	private String lastName;
	
	private GenderEnum gender;
	
	@Past
	@DateTimeFormat(pattern = "MM/dd/yyyy")
	private Date DOB;
	
	private String phone;
	
	@Email
	private String email;
	
	private String SSN;
	
	private Person() {
		// TODO Auto-generated constructor stub
	}
	
	protected Person(String firstName, String lastName, GenderEnum gender, Date DOB) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.DOB = DOB;
	}
}
