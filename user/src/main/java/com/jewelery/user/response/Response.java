package com.jewelery.user.response;

import java.util.List;

public class Response {
	
	private List<Product> productList;
	private List<Scheme> schemeList;
	
	public List<Product> getProductList() {
		return productList;
	}
	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}
	public List<Scheme> getSchemeList() {
		return schemeList;
	}
	public void setSchemeList(List<Scheme> schemeList) {
		this.schemeList = schemeList;
	}
	

}
