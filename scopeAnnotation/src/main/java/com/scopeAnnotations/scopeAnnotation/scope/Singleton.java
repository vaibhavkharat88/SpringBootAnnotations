package com.scopeAnnotations.scopeAnnotation.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value =ConfigurableBeanFactory.SCOPE_SINGLETON)
public class Singleton {
	public Singleton () {
		System.out.println("singleton scope ");
	}


}
