package com.luv2code.springdemo;

import java.util.ArrayList;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HappyFourtuneService implements FourtuenService {

	@Value("${f1}")
	public String f1;
	@Value("${f2}")
	public String f2;
	@Value("${f3}")
	public String f3;
	public Random myRandom = new Random();
	public String[] fArr = new String[3];
	
	@PostConstruct
	public  void createArray() {
		
		fArr[0] = f1;
		fArr[1] = f2;
		fArr[2] = f3;
		System.out.println("PostConstruct...............");
		 
	}
	
	 
	@Override
	public String getYourFourtune() {
	// TODO Auto-generated method stub
 		int Index = myRandom.nextInt(fArr.length);
		return fArr[Index];
	}
}


