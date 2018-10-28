package org.gontoseries.springcore.GontuSeries_8_Bean_factory;

import org.springframework.beans.factory.BeanFactory;
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
        
        //ApplicationContext context=new ClassPathXmlApplicationContext(configLocation);
        BeanFactory beanFactory = new ClassPathXmlApplicationContext(configLocation);

        
        Restaurant restaurantobj1=(Restaurant)beanFactory.getBean(beanName);
        
        restaurantobj1.setWelcomeNote("trident at its best while serving");
        
        restaurantobj1.greetCustomer();
        
        Restaurant restaurantobj2=(Restaurant)beanFactory.getBean(beanName);
        
        restaurantobj2.greetCustomer();
        
    }
}

/*
 * if we use Bean factory interface.
 * then spring will always perform lazy loading.
 * 
 * */
