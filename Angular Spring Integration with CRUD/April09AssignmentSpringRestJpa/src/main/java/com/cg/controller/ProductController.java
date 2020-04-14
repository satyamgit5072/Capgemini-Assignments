package com.cg.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Product;
import com.cg.service.ProductServiceI;

@RestController
public class ProductController {
	
	@Autowired
	ProductServiceI productService;
	
	@GetMapping("/product")
	public List<Product> fetchProduct()
	{
		return productService.reterive();
	}
	
	@GetMapping("/product/{id}")
	public Product fetchOneProduct(@PathVariable int id)
	{
		return productService.findById(id);
	}
	
	@PostMapping(value="/product/new",consumes="application/json")
	public String addProduct(@RequestBody Product product)
	{
		productService.create(product);
		return "product added";
	}
	
	@PutMapping(value="/product/update",consumes= {"application/json"})
    public String update(@RequestBody Product product) {
        productService.update(product);
        return "product updated";
    }      
	
	@DeleteMapping(value="/product/delete/{id}")
	public String deleteProduct(@PathVariable int id)
	{
		productService.delete(id);
		return "product deleted";
	}

}
