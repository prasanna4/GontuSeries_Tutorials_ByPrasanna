package org.gontoseries.springcore.GontuSeries_3_Dependency_Injection_using_constructor_way;

public class Restaurant {
   
   IHotDrink hotDrink;

   public Restaurant(IHotDrink hotDrink) {
	super();
	this.hotDrink = hotDrink;
   }

   public void prepareHotDrnk() {
	   hotDrink.prepareHotDrink();
   }
   
	
}
