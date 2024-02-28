package com.cisco.rest.model.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cisco.rest.model.Product;
import com.cisco.rest.model.repo.ProductRepository;

@RestController
@RequestMapping("/api/prooduct")
public class ProductController {

	@Autowired
	ProductRepository repo;

	@PostMapping
	public String addNewProduct(@RequestBody Product product) {
		repo.addProduct(product);
		return "New Product added ";
	}
@GetMapping
	public List<Product> getAll(){
		return repo.getAllproducts();
	}
}
