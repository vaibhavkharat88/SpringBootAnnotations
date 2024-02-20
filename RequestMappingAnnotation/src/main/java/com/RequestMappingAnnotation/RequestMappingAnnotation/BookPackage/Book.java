package com.RequestMappingAnnotation.RequestMappingAnnotation.BookPackage;

public class Book {
	private int id;
	private String Name;
	private String LastName;
	public Book(int id, String name, String lastName) {
		
		this.id = id;
		Name = name;
		LastName = lastName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	
	
	

}
