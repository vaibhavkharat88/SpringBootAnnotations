package com.Autowired.AutowiredAnnotation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Autowired.AutowiredAnnotation.service.VegPizza;

@Component("pizza")


public class PizzaController {
	private VegPizza vegPizza;
	
	
//	Autowiring with Constructor
//	@Autowired
//	public PizzaController(VegPizza vegPizza) {
//		this.vegPizza=vegPizza;
//		
	
//	}
//	Autowiring with setter method
	
	@Autowired
	public void setVegPizza(VegPizza vegPizza) {
		this.vegPizza = vegPizza;
	}
	
	
	public String getPizza() {
		return vegPizza.getPizza();
	}


	

}
