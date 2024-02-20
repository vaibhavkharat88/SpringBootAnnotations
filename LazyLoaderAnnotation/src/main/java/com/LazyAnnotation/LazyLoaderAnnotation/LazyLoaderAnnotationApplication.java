package com.LazyAnnotation.LazyLoaderAnnotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.LazyAnnotation.LazyLoaderAnnotation.lazy.LaztLoader;

@SpringBootApplication
public class LazyLoaderAnnotationApplication {

	public static void main(String[] args) {
		var context =SpringApplication.run(LazyLoaderAnnotationApplication.class, args);
		
//		here how to load Lazyloader
		LaztLoader lazy =context.getBean(LaztLoader.class);
		
	}

}
