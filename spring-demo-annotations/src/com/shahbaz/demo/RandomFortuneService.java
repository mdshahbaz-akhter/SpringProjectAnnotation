package com.shahbaz.demo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private String[] data= {
			"Beware of thewolf in sheep's clothing",
			"Diligence is the mother ofgood luck",
			"The Journey is the reward"
	};
	
	//create a random number generator
	private Random myRandom=new Random();
	
	@Override
	public String getFortune() {
		//pick random string from array
		int index = myRandom.nextInt(data.length);
		return data[index];
	}

}
