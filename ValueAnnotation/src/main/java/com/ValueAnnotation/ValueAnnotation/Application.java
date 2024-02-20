package com.ValueAnnotation.ValueAnnotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ValueAnnotation.ValueAnnotation.value.ValueClass;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		var context=SpringApplication.run(Application.class, args);
		
		ValueClass value =context.getBean(ValueClass.class);
		System.out.println(value.getName(   )   +   value.getSurname());
		
	}

}
