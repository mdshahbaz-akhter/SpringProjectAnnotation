package com.shahbaz.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
//@Component("thatSillyCoach")
@Component //default bean id
//@Scope("prototype")
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println("Inside TennisCoach Constructor");
	}
	
//	@Autowired
//	public TennisCoach(FortuneService fortuneService) {
//		
//		this.fortuneService = fortuneService;
//	}
	
	
//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		System.out.println("Setter Method");
//		this.fortuneService = fortuneService;
//	}
	
	//define init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println("-----------Begining------------");
	}
	//define destroy method
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println("---------End-----------");
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice consistently";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
