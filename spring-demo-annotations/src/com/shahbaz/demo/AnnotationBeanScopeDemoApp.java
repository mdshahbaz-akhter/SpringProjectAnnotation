package com.shahbaz.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml"); 
		
		Coach theCoach=context.getBean("tennisCoach",Coach.class);
		Coach alphaCoach=context.getBean("tennisCoach",Coach.class);
		System.out.println(theCoach==alphaCoach);
		System.out.println("Memory Location for theCoach "+theCoach);
		System.out.println("Memory Location for alphaCoach "+alphaCoach);
		context.close();
	}

}
