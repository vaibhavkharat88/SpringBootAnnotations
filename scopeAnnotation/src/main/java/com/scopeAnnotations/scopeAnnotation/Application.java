package com.scopeAnnotations.scopeAnnotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.scopeAnnotations.scopeAnnotation.scope.Prototype;
import com.scopeAnnotations.scopeAnnotation.scope.Singleton;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		var context =SpringApplication.run(Application.class, args);
		
		Singleton single1= context.getBean(Singleton.class);
		System.out.println(single1.hashCode());
		Singleton single2= context.getBean(Singleton.class);
		System.out.println(single2.hashCode());
		Singleton single3= context.getBean(Singleton.class);
		System.out.println(single3.hashCode());
		Prototype proto1= context.getBean(Prototype.class);
		System.out.println(proto1.hashCode());
		Prototype proto2= context.getBean(Prototype.class);
		System.out.println(proto2.hashCode());
		Prototype proto3= context.getBean(Prototype.class);
		System.out.println(proto3.hashCode());
		
		
	}

}
