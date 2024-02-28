package com.cisco.rest.model.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cisco.rest.model.Product;

@Repository
public class ProductRepository {

	
	
	List<Product> list = new ArrayList<Product>();
	
	public void addProduct(Product product) {
		list.add(product);
		
	}
	public List<Product> getAllproducts() {
		return list;
		
	}
	
	
}
