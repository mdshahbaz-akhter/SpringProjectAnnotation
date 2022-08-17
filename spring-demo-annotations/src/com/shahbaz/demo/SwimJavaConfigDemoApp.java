package com.shahbaz.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {

	//read spring config java class
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SportConfig.class);
		
	//get bean from spring container
	//Coach theCoach=context.getBean("thatSillyCoach",Coach.class);
	
	SwimCoach theCoach=context.getBean("swimCoach",SwimCoach.class);//default bean id
	//call method on the bean
	System.out.println(theCoach.getDailyWorkout());
	System.out.println(theCoach.getDailyFortune());
	System.out.println(theCoach.getEmail());
	System.out.println(theCoach.getTeam());

	//close context
	context.close();
		
	}

}
