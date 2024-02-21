package com.DeleMappingAnnotation.DeleMappingAnnotation.Mycontroller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.DeleMappingAnnotation.DeleMappingAnnotation.Book.Book;

@RestController
public class Controller {
	@ResponseStatus(value = HttpStatus.CREATED)
	@PostMapping(value="/post")
	public Book postBook(@RequestBody Book postBook) {
		System.out.println(postBook.getId());
		System.out.println(postBook.getName());
		System.out.println(postBook.getLastName());
		
		return postBook;
		
		
	}
	@ResponseStatus(value=HttpStatus.OK)
	@PutMapping(value="/put/{id}")
	
	public Book putBook(@PathVariable int id, @RequestBody Book putBook) {
		System.out.println(id);
		System.out.println(putBook.getName());
		System.out.println(putBook.getLastName());
		putBook.setId(id);
		return putBook;
	}
	@ResponseStatus(value = HttpStatus.OK)
	@DeleteMapping(value="delete/{id}")
	public void deleteBook(@PathVariable int id) {
		System.out.println(id);
		System.out.println("succesfully deleted") ;
		
		
	}
	

}
