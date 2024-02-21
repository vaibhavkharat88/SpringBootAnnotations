package com.PostMappingAnnotation.PostMappingAnnotation.MyController;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.PostMappingAnnotation.PostMappingAnnotation.Book.Book;

@RestController
public class Mycontroller {
	@GetMapping("/getdatat" )
	public Book getBook () {
		Book book = new  Book(1,"vaibhav","kharat");
		return book;
	}
	
	
//	here we Creating a RESTFul POST APIs
	
	@PostMapping(value="/post/create",
			consumes = MediaType.APPLICATION_JSON_VALUE)
	
	@ResponseStatus(value=HttpStatus.CREATED)
	public Book creataBook(@RequestBody Book book) {
		System.out.println(book.getId());
		System.out.println(book.getName());
		System.out.println(book.getLastName());
		return book;
	}

}
