package com.love2code.springdemo;

public class A9CricketCoach implements A8Coach {

	private A6FortuneService fortuneService;
	
	//add new field for email-addr and team
	private String emailAddress;
	private String team;
	private String team2;
	
	
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach:-inside setter meth -setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach:-inside setter meth -setTeam");
		this.team = team;
	}

	
	
	
	public String getTeam2() {
		return team2;
	}

	public void setTeam2(String team2) {
		System.out.println("CricketCoach:-inside setter meth -setTeam2");
	
		this.team2 = team2;
	}

	//create no-arg constructor
	public A9CricketCoach() {
		
		System.out.println("CricketCoach:-inside No arg constructor");
	}
	
	// setter meth in ur class for injection
	public void setFortuneService(A6FortuneService fortuneService) {
		
		System.out.println("CricketCoach:-inside setter meth -setFortuneService");
		this.fortuneService = fortuneService;
	}
	
	
	@Override
	public String getDailyWorkout() {
		
		return " make fast  bolling practice 15 min a day";
	}

	

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
