package com.PutMappingAnnotation.PutMappingAnnotation.MyBook;

public class Book {
	
	private int id;
	private String Name;
	private String LastName;
	
	
	public Book(int id, String Name, String LastName) {
		
		this.id = id;
		this.Name = Name;
		this.LastName = LastName;
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
