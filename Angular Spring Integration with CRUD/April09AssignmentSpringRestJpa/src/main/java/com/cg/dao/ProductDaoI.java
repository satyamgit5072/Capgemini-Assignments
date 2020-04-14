package com.cg.dao;

import java.util.List;

import com.cg.entity.Product;

public interface ProductDaoI {
	
	public void create(Product p);
	public List reterive();
	public Product findById(int id);
	public void delete(int id);
	public void update(Product Product);


}
