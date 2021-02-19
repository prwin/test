package com.love2code.springdemo;

public class A3TrackCoach implements A8Coach {
	//def private field for dependency
		private A6FortuneService fortuneService;
		
		public A3TrackCoach() {
			
			
		}
		//def constractor for dependency injuction
		 public A3TrackCoach(A6FortuneService  theFortuneService) {
			fortuneService=theFortuneService;
			
		}
	
	
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		
		return "just do it :-"+fortuneService.getFortune();
	}

}
