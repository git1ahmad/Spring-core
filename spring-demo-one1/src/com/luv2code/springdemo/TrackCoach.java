package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	
	// define a private field for dependency 
	private FortuneService fortuneService;
	
	public TrackCoach(){
		
	}
	// define a constructor for dependency injection
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5K";
	}

	@Override
	public String getDailyFortune() {
	
		return "Just do it: " + fortuneService.getFortune();
	}
	
	// add an init method 
	public void doMyStartupStuff(){
		
		System.out.println("TrackCoach: inside method doMyStartUpStuff ");
	}
	
	// add a destroy method 
	public void doMyCleanupStuffYoYo(){
		System.out.println("TrackCoach: inside method doMyCleanupStuffYoYo");
	}

}
