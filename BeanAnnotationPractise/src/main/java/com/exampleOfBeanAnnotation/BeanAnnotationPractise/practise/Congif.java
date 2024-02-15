package com.exampleOfBeanAnnotation.BeanAnnotationPractise.practise;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Congif {
	@Bean
	public Bmw car() {
		return  new Bmw();
	}
	
	@Bean
	public Audi gadi() {
		return new Audi();
		
	}

	

}
