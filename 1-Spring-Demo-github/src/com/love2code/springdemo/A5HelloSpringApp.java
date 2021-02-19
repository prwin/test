package com.love2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class A5HelloSpringApp {

	public static void main(String[] args) {
		// load spring config file
		ClassPathXmlApplicationContext context=new
				ClassPathXmlApplicationContext("A4applicationcontext.xml");
		
		//retrive bean from spring container
		A8Coach theCoach=context.getBean("myCoach",A8Coach.class);
		
		//call meth on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//call new meth for fortune
		System.out.println(theCoach.getDailyFortune());
		
		
		//close the context
context.close();
	}

}
