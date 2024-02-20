package com.LazyAnnotation.LazyLoaderAnnotation.lazy;

import org.springframework.stereotype.Component;

@Component
public class EagleLoader {
	public EagleLoader() {
		System.out.println("EagleLoader");
	}

}
