package com.cg.service;

import java.util.List;

import com.cg.entity.Student;

public interface StudentServiceI {
	
	public void create(Student s);
	public List reterive();
	public Student findById(int id);
	public void delete(int id);
	public void update(int id);
}
