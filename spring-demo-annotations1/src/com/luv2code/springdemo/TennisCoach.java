package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
// @Scope("prototype")
public class TennisCoach implements Coach {
	
	// define a field injection
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	// define a default constructor
	
	public TennisCoach (){
		System.out.println(">> TennisCoach: inside default constructor");
	}
	
	// define a in-it method 
	@PostConstruct
	public void doMyStartupStuff(){
		System.out.println(">> TennisCoach: inside of doMyStartupStuff()");
	}
	
	// define a destroy method 
	@PreDestroy
	public void doMyCleanupStuff(){
		System.out.println(">> TennisCoach: inside of doMyCleanStuff()");
	}
	
	
	
	/*
	 // define a method injection 
	@Autowired
	public void doSomeCrazyStuff(FortuneService theFortuneService){
		System.out.println(">> TennisCoach: inside doSomeCrazyStuff() method");
		fortuneService = theFortuneService;
	}
	*/
	/*
	// define a setter method injection
	@Autowired
	public void setFortuneService(FortuneService theFortuneService){
		System.out.println(">> TennisCoach: inside setFortuneService() method");
		fortuneService = theFortuneService;
	}
	*/
	/*
	// constructor injection
	@Autowired
	public TennisCoach(FortuneService theFortuneService){
		fortuneService = theFortuneService;
	}
   */
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
