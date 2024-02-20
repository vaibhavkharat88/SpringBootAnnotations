package com.LazyAnnotation.LazyLoaderAnnotation.lazy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
// if we use Lazy annotation then spring  doesn't create  bean in IOC Container
// if u want to check  difference betn  eager and lazy loading .. remove @lazy annotation
@Lazy
public class LaztLoader {
	public LaztLoader() {
		System.out.println("LazyLoader");
	}

}
