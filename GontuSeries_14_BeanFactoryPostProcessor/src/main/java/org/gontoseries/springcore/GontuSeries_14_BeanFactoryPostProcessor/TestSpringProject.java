package org.gontoseries.springcore.GontuSeries_14_BeanFactoryPostProcessor;

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
       
             
        Restaurant restaurantobj1=(Restaurant)context.getBean(beanName);
        
        restaurantobj1.greetCustomer();
        
               
    }
}

