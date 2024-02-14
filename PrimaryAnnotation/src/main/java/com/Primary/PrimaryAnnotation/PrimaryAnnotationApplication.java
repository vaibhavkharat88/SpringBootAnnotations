package com.Primary.PrimaryAnnotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Primary.PrimaryAnnotation.controller.PizzaControler;

@SpringBootApplication
public class PrimaryAnnotationApplication {

	public static void main(String[] args) {
		var context=SpringApplication.run(PrimaryAnnotationApplication.class, args);
		PizzaControler pizzacontroller=(PizzaControler) context.getBean("pizza");
		System.out.println(pizzacontroller.getPizza());
	}

}
