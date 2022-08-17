package com.shahbaz.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {

	//read spring config java class
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SportConfig.class);
		
	//get bean from spring container
	//Coach theCoach=context.getBean("thatSillyCoach",Coach.class);
	Coach theCoach=context.getBean("tennisCoach",Coach.class);//default bean id
	//call method on the bean
	System.out.println(theCoach.getDailyWorkout());
	System.out.println(theCoach.getDailyFortune());
	//close context
	context.close();
		
	}

}
