package com.example.container.ContainerAnnotation.controller;

import org.springframework.stereotype.Component;

@Component("pizza")
public class PizzaController {
	public String getPizza() {
		return "hot pizza";
		
	}

}
