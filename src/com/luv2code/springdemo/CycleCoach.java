package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CycleCoach implements Coach {

	@Autowired
	FourtuenService myFourtuneService;
	
	 
	@Override
	public String getDailyworkout() {
		// TODO Auto-generated method stub
		return "Do slow Cycling for 30 min everyday.";
	}

	@Override
	public String getYourFourtune() {
		// TODO Auto-generated method stub
		return myFourtuneService.getYourFourtune();
	}

}
