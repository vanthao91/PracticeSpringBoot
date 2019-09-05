package com.example.demo.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;

import org.springframework.format.annotation.DateTimeFormat;

import com.example.demo.enumaric.GenderEnum;

@Entity
@lombok.Getter
@lombok.Setter
public class Employee extends Person {

	@NotBlank
	private String employeeId;
	
	@DateTimeFormat(pattern = "MM/dd/yyyy")
	private Date startDate;

	@DateTimeFormat(pattern = "MM/dd/yyyy")
	private Date endDate;
	
	@ManyToOne
    @JoinColumn(name = "department_id")
	private Department department;
	
	@OneToOne
	@JoinColumn(name = "address_Id")
	private Address address;
	
	public Employee(String firstName, String lastName, GenderEnum gender, Date DOB) {
		super(firstName, lastName, gender, DOB);
		this.employeeId = "";
		this.address = new Address();
	}
}
