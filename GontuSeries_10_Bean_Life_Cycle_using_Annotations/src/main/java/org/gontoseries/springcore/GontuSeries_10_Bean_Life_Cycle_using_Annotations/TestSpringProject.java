package org.gontoseries.springcore.GontuSeries_10_Bean_Life_Cycle_using_Annotations;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
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
       
        ((AbstractApplicationContext)context).registerShutdownHook();
        //this means spring will destroy all beans before end of main.
        
        
        Restaurant restaurantobj1=(Restaurant)context.getBean(beanName);
        
        restaurantobj1.greetCustomer();
        
               
    }
}

/*
 * 
Init method called bean immediately after instantiating bean
Welcome to lifecycle demo
destroy method called bean will destroy now

 */