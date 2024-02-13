package com.Autowired.AutowiredAnnotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Autowired.AutowiredAnnotation.controller.PizzaController;

@SpringBootApplication
public class AutowiredAnnotationApplication {

	public static void main(String[] args) {
		var context=SpringApplication.run(AutowiredAnnotationApplication.class, args);
		PizzaController pizzacontroller=(PizzaController) context.getBean("pizza");
		System.out.println(pizzacontroller.getPizza());
		
	}

}
