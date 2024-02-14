package com.Primary.PrimaryAnnotation.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
// when we set primary to this class it will be executes first 
@Primary
public class NonVegPizza implements Pizza {
	public String getPizza() {
		return "Non veg Pizza";
	}

}
