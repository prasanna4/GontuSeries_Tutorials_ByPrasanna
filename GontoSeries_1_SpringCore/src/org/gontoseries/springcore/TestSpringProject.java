package org.gontoseries.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ApplicationContext context=new ClassPathXmlApplicationContext("SpringConfig.xml");
		//will find and load springconfig file from project to application context.

		//ApplicationContext- interface.
		//read config from xml then calling difference methods.
		
		
		Restaurant restaurantobj=(Restaurant)context.getBean("restaurantBean");
		restaurantobj.greetCustomer();
	}

}
