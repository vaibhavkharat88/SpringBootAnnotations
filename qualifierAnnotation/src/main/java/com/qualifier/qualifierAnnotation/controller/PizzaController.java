package com.qualifier.qualifierAnnotation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.qualifier.qualifierAnnotation.service.Pizza;
import com.qualifier.qualifierAnnotation.service.VegPizza;

@Component("pizza")
public class PizzaController {
	
//	interface Pizza
	private Pizza pizza;
	
	@Autowired
//	with the help of @qualifier we can take decesion which springbean is Enject
	public PizzaController(@Qualifier("nonvegPizza") Pizza pizza) {
		this.pizza=pizza;
		
	}
	public String getPizza() {
		return pizza.getPizza();
	}

}
