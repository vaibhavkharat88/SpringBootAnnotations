package com.PutMappingAnnotation.PutMappingAnnotation.MyController;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.PutMappingAnnotation.PutMappingAnnotation.MyBook.Book;

@RestController
public class Mycontroller {
	
	
//	POSTING A DATA 
	@PostMapping (value="/create",consumes = MediaType.APPLICATION_JSON_VALUE)
	
	@ResponseStatus (value=HttpStatus.CREATED)
	public Book book(@RequestBody Book book) {
		System.out.println(book.getId());
		System.out.println(book.getName());
		System.out.println(book.getLastName());
		return book;
	}
	
//	UPDATE A DATA
	
//	@PutMapping(value ="/update/{id}")
//	 public ResponseEntity<Book> updateBook (@PathVariable int id , @RequestBody Book updateBook){
//		
//		System.out.println(id);
//		System.out.println(updateBook.getName());
//		System.out.println(updateBook.getLastName());
//		updateBook.setId(id);
//		return ResponseEntity.ok(updateBook);
//	}
	
	@PutMapping (value="/updateme/{id}")
	
	@ResponseStatus(value=HttpStatus.OK)
	public Book updateMyBook( @PathVariable int id, @RequestBody Book updateMyBook) {
		System.out.println(id);
		System.out.println(updateMyBook.getName());
		System.out.println(updateMyBook.getLastName());
		updateMyBook.setId(id);
		return updateMyBook;
		
		
		
	}
	
	
}
