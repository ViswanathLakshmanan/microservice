package com.jewelery.user.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.jewelery.user.response.Product;
import com.jewelery.user.response.Response;
import com.jewelery.user.response.Scheme;

@RestController
public class UserController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/user")
	public Response findallResponse(){
		ResponseEntity<Product[]> productList = restTemplate.getForEntity("http://product-catalog/product", Product[].class);
		ResponseEntity<Scheme[]> schemeList = restTemplate.getForEntity("http://scheme-catalog/scheme", Scheme[].class);
		Response response = new Response();
		response.setProductList(Arrays.asList(productList.getBody()));
		response.setSchemeList(Arrays.asList(schemeList.getBody()));
		return response;
		
	}
	
	@LoadBalanced
	@Bean
	public RestTemplate getRestTemplate()
	{
		return new RestTemplate();
	}

}
