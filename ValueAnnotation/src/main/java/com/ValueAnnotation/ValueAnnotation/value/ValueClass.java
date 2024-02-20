package com.ValueAnnotation.ValueAnnotation.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class ValueClass {
	@Value("vaibhav")
	private  String name;
	
	@Value("kharat")
	private String surname;

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	
	
	

}
