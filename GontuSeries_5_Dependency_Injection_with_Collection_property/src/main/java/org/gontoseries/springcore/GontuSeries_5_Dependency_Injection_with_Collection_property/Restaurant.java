package org.gontoseries.springcore.GontuSeries_5_Dependency_Injection_with_Collection_property;

import java.util.List;

public class Restaurant {
   
   private List restaurantWaitersList;

   public List getRestaurantWaitersList() {
	   
	return restaurantWaitersList;
	
   }

   public void setRestaurantWaitersList(List restaurantWaitersList) {
	   
	this.restaurantWaitersList = restaurantWaitersList;
	
   }
   public void displayWaitersNames() {
	   System.out.println("All waiters working in restaurant: "+restaurantWaitersList);
   }
   
	
}
