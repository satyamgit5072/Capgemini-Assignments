package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.entity.Student;

@Transactional
@Repository
public class StudentDaoImp implements StudentdaoI {
	
	@PersistenceContext
	EntityManager em;

	@Override
	public void create(Student s) {
		em.persist(s);//this object will make a reference in database table	
	}

	@Override
	public List reterive() 
	{
		// TODO Auto-generated method stub
		//jpql
		Query q = em.createQuery("select s from Student s");//("from Student s")
		return q.getResultList();
	}

	@Override
	public Student findById(int id) {
		// TODO Auto-generated method stub
		return em.find(Student.class, id);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		Student s = em.find(Student.class, id);//this method will which id to remove
		System.out.println(s.getId()+" "+s.getDept()+" "+s.getName());
		
		em.remove(s);//this is object from the database
		System.out.println("deleted");
	}

	@Override
	public void update(int id) {
		// TODO Auto-generated method stub
		Student stu = em.find(Student.class, id);
		stu.setDept("hr");
		
		
	}

}
