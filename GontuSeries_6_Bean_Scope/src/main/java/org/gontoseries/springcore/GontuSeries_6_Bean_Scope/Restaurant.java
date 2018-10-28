package org.gontoseries.springcore.GontuSeries_6_Bean_Scope;

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
