package org.gontoseries.springcore.GontuSeries_12_BeanPostProcessor;

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
        
        String configLocation="SpringConfig.xml";
        String beanName="restaurantBean";
        
        ApplicationContext context=new ClassPathXmlApplicationContext(configLocation);
       
        ((AbstractApplicationContext)context).registerShutdownHook();
        //this means spring will destroy all beans before end of main.
        
        
        Restaurant restaurantobj1=(Restaurant)context.getBean(beanName);
        
        restaurantobj1.greetCustomer();
        
               
    }
}

