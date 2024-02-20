package com.StereotypesAnnotations.StereoTypeAnnotations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.StereotypesAnnotations.StereoTypeAnnotations.controller.MyController;
import com.StereotypesAnnotations.StereoTypeAnnotations.repository.MyRepository;
import com.StereotypesAnnotations.StereoTypeAnnotations.service.MyService;


@SpringBootApplication
public class StereoTypeAnnotationsApplication {

	public static void main(String[] args) {
		var context =SpringApplication.run(StereoTypeAnnotationsApplication.class, args);
//		myRepository 
		MyRepository repository= context.getBean(MyRepository.class);
		System.out.println(repository.hello());
//		myController
		MyController mycontroller =context.getBean(MyController.class);
		System.out.println(mycontroller.hello());
//		myservice
		MyService myservice=context.getBean(MyService.class);
		System.out.println(myservice.hello());
		
	}

}
