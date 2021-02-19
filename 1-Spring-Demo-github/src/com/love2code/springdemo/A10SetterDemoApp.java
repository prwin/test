package com.love2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class A10SetterDemoApp {

	public static void main(String[] args) {
		// load spring conf file
ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("A4applicationcontext.xml");

		//retrive bean from spring container
	A9CricketCoach theCoach=	context.getBean("myCricketCoach",A9CricketCoach.class);
	
		//call meth on bean
	System.out.println(theCoach.getDailyWorkout());
	System.out.println(theCoach.getDailyFortune());	
	
	
	//call our new meth to get literal values
	System.out.println(theCoach.getEmailAddress());
	System.out.println(theCoach.getTeam());
	System.out.println(theCoach.getTeam2());
	
	//close the context
	context.close();
	
	}

}
