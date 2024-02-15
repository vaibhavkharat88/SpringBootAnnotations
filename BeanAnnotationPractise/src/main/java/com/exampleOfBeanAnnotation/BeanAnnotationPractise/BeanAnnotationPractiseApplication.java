package com.exampleOfBeanAnnotation.BeanAnnotationPractise;

import java.io.ObjectInputFilter.Config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.exampleOfBeanAnnotation.BeanAnnotationPractise.practise.Audi;
import com.exampleOfBeanAnnotation.BeanAnnotationPractise.practise.Bmw;
import com.exampleOfBeanAnnotation.BeanAnnotationPractise.practise.Congif;

@SpringBootApplication
public class BeanAnnotationPractiseApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeanAnnotationPractiseApplication.class, args);
		ApplicationContext context = new AnnotationConfigApplicationContext(Congif.class);
		Bmw bmw =context.getBean(Bmw.class);
		Audi audi =context.getBean(Audi.class);
		System.out.println(audi.getName());
		System.out.println(bmw.getName());
	}

}
