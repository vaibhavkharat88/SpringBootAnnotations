package com.Primary.PrimaryAnnotation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.Primary.PrimaryAnnotation.service.Pizza;
@Component("pizza")
public class PizzaControler  {
	
	private Pizza pizza;
	@Autowired
	public PizzaControler (Pizza pizza) {
		this.pizza =pizza;
	}
	
	public String getPizza() {
		return pizza.getPizza();
	}
	

}
