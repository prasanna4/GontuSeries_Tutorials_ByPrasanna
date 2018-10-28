package org.gontoseries.springcore.GontuSeries_7_Lazy_loading_and_Pre_loading_of_a_Bean;

import java.util.List;

public class Restaurant {
   
   private String welcomeNote;

   public String getWelcomeNote() {
	   return welcomeNote;
   }

   public void setWelcomeNote(String welcomeNote) {
	   this.welcomeNote = welcomeNote;
   }
   
   public void greetCustomer() {
	   System.out.println("This is Welcome Note:= "+welcomeNote);
   }
	
}
