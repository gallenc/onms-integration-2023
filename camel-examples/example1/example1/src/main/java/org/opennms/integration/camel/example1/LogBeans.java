package org.opennms.integration.camel.example1;

import java.util.Arrays;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class LogBeans {
	
	@Autowired
    ApplicationContext applicationContext;

	@PostConstruct 
    public void printBeans() {
		System.out.println("******************** BEANS IN CONTEXT: ");
		for(String beanName: Arrays.asList(applicationContext.getBeanDefinitionNames())) {
			System.out.println("   "+beanName);
		}
        
    }

}
