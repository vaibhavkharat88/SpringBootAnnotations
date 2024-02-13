package com.example.container.ContainerAnnotation;

import java.util.jar.Attributes.Name;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.container.ContainerAnnotation.controller.PizzaController;

@SpringBootApplication
public class ContainerAnnotationApplication {

	public static void main(String[] args) {
	var context=	SpringApplication.run(ContainerAnnotationApplication.class, args);
	PizzaController pizzacontroller = (PizzaController) context.getBean("pizza");
	System.out.println(pizzacontroller.getPizza());
	}

}
