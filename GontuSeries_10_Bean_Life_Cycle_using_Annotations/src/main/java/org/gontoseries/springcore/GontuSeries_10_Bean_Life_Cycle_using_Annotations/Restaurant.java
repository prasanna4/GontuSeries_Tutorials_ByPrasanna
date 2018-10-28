package org.gontoseries.springcore.GontuSeries_10_Bean_Life_Cycle_using_Annotations;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Restaurant {
   
   
   
   public void greetCustomer() {
	   System.out.println("Welcome to lifecycle demo");
   }
   
   @PostConstruct
   public void init() {
	   System.out.println("PostConstruct: Init method called bean immediately after instantiating bean");

   }
   
   @PreDestroy
   public void destroy() {
	   System.out.println("PreDestroy: destroy method called bean will destroy now");

   }
	
}
