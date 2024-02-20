package com.ControllerAnnotation.ControlerAnnotation.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ControllerAnnotation.ControlerAnnotation.beans.Book;

@Controller
public class BoolController {
	@RequestMapping("/hello")
	@ResponseBody
	public String hello() {
		return "hello vaibhav";
	}
	@RequestMapping
	@ResponseBody
	public Book getbook() {
		Book book =new Book (1,"vaibhav","lets do it");
		return book;
	}

}
