package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.ProductDaoI;
import com.cg.entity.Product;

@Service
public class ProductServiceImp implements ProductServiceI {

	@Autowired
	ProductDaoI productDao;
	
	@Override
	public void create(Product p) {
		// TODO Auto-generated method stub
		productDao.create(p);
		

	}

	@Override
	public List reterive() {
		// TODO Auto-generated method stub
		return productDao.reterive();
	}

	@Override
	public Product findById(int id) {
		// TODO Auto-generated method stub
		return productDao.findById(id);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		productDao.delete(id);
		System.out.println("deleted");

	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub
		productDao.update(product);
		System.out.println("updated");

	}

}
