package com.PostMappingAnnotation.PostMappingAnnotation.Book;

public class Book {
	private int id;
	private String Name;
	private String lastName;
	public Book(int id, String Name, String lastName ) {
		
		this.id = id;
		this.Name = Name;
		this.lastName = lastName;
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
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
	
	

}
