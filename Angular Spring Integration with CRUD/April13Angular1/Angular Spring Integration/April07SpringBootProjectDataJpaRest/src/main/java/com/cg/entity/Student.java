package com.cg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

//transient--persistance--detached--(object states)

@Entity//this class can able to add to the data base
@Table(name="student01")
public class Student {
	@NotNull(message="Student Id is mandatory")
	@Id
	private int id;
	@Column
	@NotEmpty(message="Student name is mandatory")
	@Size(min=3,max=22,message="length min 3 and max 22 chars are allowed")
	private String name;
	@NotEmpty(message="Student dept is mandatory")
	private String dept;
	
	public Student()
	{
		
	}
	public Student(int id, String name, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}

}
