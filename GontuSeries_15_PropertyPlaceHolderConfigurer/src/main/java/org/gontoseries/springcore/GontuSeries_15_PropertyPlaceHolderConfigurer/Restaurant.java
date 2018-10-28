package org.gontoseries.springcore.GontuSeries_15_PropertyPlaceHolderConfigurer;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Restaurant{  
   
   private String welcomeNote;
	
   public String getWelcomeNote() {
	return welcomeNote;
   }

   public void setWelcomeNote(String welcomeNote) {
	   this.welcomeNote = welcomeNote;
   	}

public void greetCustomer() {
	   System.out.println("Welcome to our restaurant "+welcomeNote);
   }

	
}
