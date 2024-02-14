package com.qualifier.qualifierAnnotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.qualifier.qualifierAnnotation.controller.PizzaController;

@SpringBootApplication
public class QualifierAnnotationApplication {

	public static void main(String[] args) {
		var context=SpringApplication.run(QualifierAnnotationApplication.class, args);
		PizzaController pizzacontroller = (PizzaController) context.getBean("pizza");
		System.out.println(pizzacontroller.getPizza());
		
	}

}
