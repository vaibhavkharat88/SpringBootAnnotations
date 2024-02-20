package com.RestController.RestController.Annotation.Book;

public class Book {
	
	private int id;
	private String name;
	private String sirname;
	public Book(int id, String name, String sirname) {

		this.id = id;
		this.name = name;
		this.sirname = sirname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSirname() {
		return sirname;
	}
	public void setSirname(String sirname) {
		this.sirname = sirname;
	}
	
	
	
}
