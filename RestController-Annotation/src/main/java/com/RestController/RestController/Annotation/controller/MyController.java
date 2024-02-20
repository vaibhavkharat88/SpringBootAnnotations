package com.RestController.RestController.Annotation.controller;


import org.springframework.web.bind.annotation.RequestMapping;

// using @RestController
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.RestController.RestController.Annotation.Book.Book;

@RestController
public class MyController {
	
	@RequestMapping("/book")
//	when we work with @restController don't need of @ResponseBody
//	@ResponseBody
	public Book getBook() {
		Book book= new Book(1,"vaibhav","pawar");
		return book;
	}
	@RequestMapping("/hii")
	public String hello() {
		return "hello vaibhav";
		
	}
	



}
