    package com.love2code.springdemo;

  
    public class A1BaseballCoach implements A8Coach {

	//def private field for dependency
	private A6FortuneService fortuneService;
	
	
	//def constractor for dependency injuction
	public A1BaseballCoach(A6FortuneService  theFortuneService) {
		fortuneService=theFortuneService;
		
	}
	
	public String getDailyWorkout() {
		return "Spend 30 min on batting practice";
		
		
	}

	@Override
	public String getDailyFortune() {
		
		//use my fortune service to get a fortune
		return fortuneService.getFortune();
	}
	
	
}
