package org.gontoseries.springcore.GontuSeries_7_Lazy_loading_and_Pre_loading_of_a_Bean;

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
        
        restaurantobj1.setWelcomeNote("oberoy at its best while serving");
        
        restaurantobj1.greetCustomer();
        
        Restaurant restaurantobj2=(Restaurant)context.getBean(beanName);
        
        restaurantobj2.greetCustomer();
        
    }
}


