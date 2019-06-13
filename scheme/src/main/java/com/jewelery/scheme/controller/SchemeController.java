package com.jewelery.scheme.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jewelery.scheme.model.Scheme;

@RestController
@RequestMapping("/")
public class SchemeController {
	
	private static List<Scheme> schemeList = new ArrayList<>();
	
	
	@GetMapping("scheme")
	public List<Scheme> findallScheme(){
		schemeList.clear();
		for(int i=0 ; i< 4; i++) {
			Scheme s = new Scheme();
			s.setId(i);
			s.setScheme("Scheme "+i);
			
			schemeList.add(s);
		}
		
		return schemeList;
	}

}
