package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;
import com.example.demo.model.SucessResponse;

@RestController
@RequestMapping("/")
public class ProductContreller {
	
	public static List<Product> productList = new ArrayList<>();
	
	public static void initialProduct() {
	       for(int i=0;i<4;i++) {
	    	   Product p = new Product();
	    	   p.setId(i);
	    	   p.setName("Item "+i);
	    	   p.setPrise(i*15);
	    	   
	    	   productList.add(p);
	       }
	}
	
	@PostMapping("product")
	public SucessResponse addProduct(@RequestBody Product product) {
		SucessResponse resp = new SucessResponse();
		
		if(productList.add(product)) {
			resp.setId(1);
			resp.setName("OK");
		}
		
		return resp;
		
	}
	
	@GetMapping("product")
	public List<Product> findallProduct() {	
		initialProduct();
		return productList;
		
	}

}
