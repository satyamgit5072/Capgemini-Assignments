package com.cg;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cg.dao.StudentdaoI;
import com.cg.entity.Student;

@SpringBootApplication
public class April07SpringwebjpaApplication /* implements CommandLineRunner */{

	/*
	 * @Autowired StudentdaoI studao;
	 */

	public static void main(String[] args) {
		SpringApplication.run(April07SpringwebjpaApplication.class, args);
	}

	//the below is used if not using the controller 
	/*
	 * @Override public void run(String... args) throws Exception { // TODO
	 * Auto-generated method stub
	 * 
	 * 
	 * Student s1 = new Student(1, "sachin", "cs"); Student s2 = new Student(2,
	 * "ramu", "mec"); Student s3 = new Student(3, "hari", "cs"); Student s4 = new
	 * Student(4, "rinu", "ece");
	 * 
	 * studao.create(s1); studao.create(s2); studao.create(s3); studao.create(s4);
	 * 
	 * System.out.println("rows inserted");
	 * 
	 * 
	 * 
	 * List<Student> studentlist = studao.reterive();
	 * 
	 * for(Student stu : studentlist) {
	 * System.out.println(stu.getId()+" "+stu.getName()+" "+stu.getDept()); }
	 * 
	 * 
	 * Student stu = studao.findById(2);
	 * System.out.println(stu.getId()+" "+stu.getName()+" "+stu.getDept());
	 * 
	 * 
	 * studao.delete(3);
	 * 
	 * studao.update(4);
	 * 
	 * }
	 */

}
