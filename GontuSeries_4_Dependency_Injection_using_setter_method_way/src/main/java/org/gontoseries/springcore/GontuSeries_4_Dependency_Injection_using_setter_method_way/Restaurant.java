package org.gontoseries.springcore.GontuSeries_4_Dependency_Injection_using_setter_method_way;

public class Restaurant {
   
   IHotDrink hotDrink;

   

   public void setHotDrink(IHotDrink hotDrink) {
	this.hotDrink = hotDrink;
   }



  public void prepareHotDrnk() {
	   hotDrink.prepareHotDrink();
   }
   
	
}
