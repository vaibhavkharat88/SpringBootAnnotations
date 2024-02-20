package com.RequestMappingAnnotation.RequestMappingAnnotation.Mycontroller;

import java.lang.reflect.Method;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.RequestMappingAnnotation.RequestMappingAnnotation.BookPackage.Book;

@RestController
@RequestMapping("vk")
public class Mycontroller  {
	
	
//	RequestMapping with  class 
	
//	we can use @GetMapping over @requestMpaiing when we work with GET request
	@GetMapping(value={"/book"},
		
		produces = {MediaType.APPLICATION_JSON_VALUE})
		
			

	
	public Book getBook() {
		Book book = new Book(5,"vaibhav","kharat");
		return book;
	}
	
//	RequestMapping with Method
	
	@RequestMapping("/")
	public String Hello() {
		return "hii user";
	}
	
//	REquestMapping with Multiple Urls
	@RequestMapping(value= {"/info","info1","info2"})
	public String info() {
		return "Information with multiple url";
	}
	

}
