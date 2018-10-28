package org.gontoseries.springcore.GontuSeries_2_inject_value_into_bean_propery;

public class Restaurant {
   
	private String welcomeNote;
	
	public String getWelcomeNote() {
		return welcomeNote;
	}

	public void setWelcomeNote(String welcomeNote) {
		this.welcomeNote = welcomeNote;
	}

	
	
	public void greetCustomer() {
		System.out.println("Welcome to restaurant with welcome note:="+getWelcomeNote());
	}
	
}
