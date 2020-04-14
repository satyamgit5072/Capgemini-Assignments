package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.StudentdaoI;
import com.cg.entity.Student;

@Service
public class StudentServiceImp implements StudentServiceI {
	
	@Autowired
	StudentdaoI studentdao;
	
	

	@Override
	public void create(Student s) {
		studentdao.create(s);
		
	}

	@Override
	public List reterive() {
		return studentdao.reterive();
	}

	@Override
	public Student findById(int id) {
		return studentdao.findById(id);
	}

	@Override
	public void delete(int id) {
		Student st = studentdao.findById(id);
		if(st!=null)
		studentdao.delete(id);
		else 
			throw new RuntimeException("no id exits");
		
	}

	@Override
	public void update(int id) {
		studentdao.update(id);
		
	}
	

}
