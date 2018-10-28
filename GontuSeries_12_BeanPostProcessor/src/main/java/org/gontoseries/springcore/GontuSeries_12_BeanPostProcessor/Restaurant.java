package org.gontoseries.springcore.GontuSeries_12_BeanPostProcessor;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Restaurant{  
   
   public void greetCustomer() {
	   System.out.println("Welcome to lifecycle demo");
   }

	public void init()  {
		System.out.println("Restaurantbean is going through init");
	}
	
	public void destroy() {
		System.out.println("Restaurantbean is destroy");
	}
}
