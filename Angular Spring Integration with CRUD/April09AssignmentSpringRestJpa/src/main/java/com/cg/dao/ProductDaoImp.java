package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.entity.Product;

@Transactional
@Repository
public class ProductDaoImp implements ProductDaoI {
	
	@PersistenceContext
	EntityManager em;

	@Override
	public void create(Product p) {
		// TODO Auto-generated method stub
		em.persist(p);
	}

	@Override
	public List reterive() {
		// TODO Auto-generated method stub
		Query q = em.createQuery("select p from Product p");
		return q.getResultList();
	}

	@Override
	public Product findById(int id) {
		// TODO Auto-generated method stub
		return em.find(Product.class,id);
	}
	
	@Override
	public void update(Product product) 
	{
		// TODO Auto-generated method stub
		Product temp = findById(product.getProductID());
        if(temp != null) 
        {
            temp.setProductName(product.getProductName());
            temp.setProductPrice(product.getProductPrice());
	    }
      
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		Product p = em.find(Product.class,id);
		em.remove(p);
	}

}
