package com.xime.bupho.request;

public class RequestPhoto {
	
	private String name;
	private Integer price;
	
	public RequestPhoto(String name, Integer price) {
		this.name = name;
		this.price = price;
	}
	
	public RequestPhoto() {
		
	}
	
	 public String getName() {
		 return name;
	 }
	 
	 public void setName(String name) {
		 this.name = name;
	 }
		  
	 public Integer getPrice() {
		 return price;
	 }
	 
	 public void setPrice(Integer price) {
		 this.price = price;
	 }
		 
}
