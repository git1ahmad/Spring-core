package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		// read spring config file 
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get the bean from the container 
	    Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		// call the methods on the bean 
		System.out.println(theCoach.getDailyWorkout());
		
		// call method to get daily fortune 
		System.out.println(theCoach.getDailyFortune());
		
		// close the context 
		context.close();

	}

}
