package org.gontoseries.springcore.GontuSeries_11_Bean_Life_Cycle_using_initializingBean_and_DisposableBean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Restaurant implements InitializingBean, DisposableBean{  
   
   public void greetCustomer() {
	   System.out.println("Welcome to lifecycle demo");
   }
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Restaurantbean is going through afterPropertiesSet");
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("Restaurantbean is destroying");
	}
}
