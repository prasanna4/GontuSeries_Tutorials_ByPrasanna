package org.gontoseries.springcore.GontuSeries_6_Bean_Scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class TestSpringProject 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
        
        String configLocation="SpringConfig.xml";
        String beanName="restaurantBean";
        
        ApplicationContext context=new ClassPathXmlApplicationContext(configLocation);
        
        Restaurant restaurantobj1=(Restaurant)context.getBean(beanName);
        
        restaurantobj1.setWelcomeNote("JW marriot at its best while serving");
        
        restaurantobj1.greetCustomer();
        
        Restaurant restaurantobj2=(Restaurant)context.getBean(beanName);
        
        restaurantobj2.greetCustomer();
        
    }
}


/*
 *  
 *  config file.
 *   <bean id="restaurantBean" class="org.gontoseries.springcore.GontuSeries_6_Bean_Scope.Restaurant" scope="prototype">
      
    </bean>
   
    output:= 
   
   This is Welcome Note:= JW marriot at its best while serving
   This is Welcome Note:= null 
   because we havenot set property for second object.
   
    config file.
    <bean id="restaurantBean" class="org.gontoseries.springcore.GontuSeries_6_Bean_Scope.Restaurant" scope="singleton">
      
    </bean> 
    output:=
   This is Welcome Note:= JW marriot at its best while serving
   This is Welcome Note:= JW marriot at its best while serving 
    
    for a bean if we define scope as singleton then spring will create only one instance of bean.
    provides same instance whenever called.
     
    
 */