package com.jafra.productmicroservice.controller;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.jafra.productmicroservice.entity.ProductEntity;
import com.jafra.productmicroservice.repository.ProductRepository;

@RestController
@RequestMapping("/api/products")
public class ProductController {
	
	@Autowired
	private ProductRepository productRepository;
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<ProductEntity> getAllProducts() {
		System.out.println("entro a getAllProducts");
		List<ProductEntity> list = productRepository.findAll();
		for (ProductEntity productEntity : list) {
			productEntity.toString();
		}
		return list;
	}
	
//	@GetMapping
//	public ResponseEntity<List<ProductEntity>> getAllProducts() {
//		List<ProductEntity> list = productRepository.findAll();
//		ResponseEntity<List<ProductEntity>> responseEntity = 
//				new ResponseEntity<>(list, HttpStatus.OK);
//		return responseEntity;
//	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public void createProduct(@RequestBody ProductEntity productEntity) {
		System.out.println("Create Product");
		System.out.println(productEntity.toString());
		productRepository.save(productEntity);
	}
}
