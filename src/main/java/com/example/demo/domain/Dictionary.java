package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@lombok.Getter
@lombok.Setter
public class Dictionary {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int Id;
	
	private String tableName;

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}
}
