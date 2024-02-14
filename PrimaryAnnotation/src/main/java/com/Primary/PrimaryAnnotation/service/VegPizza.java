package com.Primary.PrimaryAnnotation.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class VegPizza  implements Pizza{
	public String getPizza() {
		return "vegpizza is here";
	}
	
	
}
