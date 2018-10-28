package org.gontoseries.springcore.GontuSeries_9_Bean_Life_Cycle;

import java.util.List;

public class Restaurant {
   
   
   
   public void greetCustomer() {
	   System.out.println("Welcome to lifecycle demo");
   }
   
   public void init() {
	   System.out.println("Init method called bean immediately after instantiating bean");

   }
   
   public void destroy() {
	   System.out.println("destroy method called bean will destroy now");

   }
	
}
