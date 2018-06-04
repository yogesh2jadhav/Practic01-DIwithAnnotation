package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringDIwithAnnotation {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext CPXApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach myCoach = CPXApplicationContext.getBean("cycleCoach", Coach.class);
		
		System.out.println(myCoach.getDailyworkout());
		System.out.println(myCoach.getYourFourtune());

	}

}
