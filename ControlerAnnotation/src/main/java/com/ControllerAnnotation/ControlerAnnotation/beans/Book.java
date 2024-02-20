package com.ControllerAnnotation.ControlerAnnotation.beans;

public class Book {
	public int id;
	public String author;
	public String desc;
	public Book(int id, String author, String desc) {
		
		this.id = id;
		this.author = author;
		this.desc = desc;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	
	
	

}
