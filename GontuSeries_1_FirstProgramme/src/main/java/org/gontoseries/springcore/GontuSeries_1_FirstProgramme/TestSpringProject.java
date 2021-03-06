package org.gontoseries.springcore.GontuSeries_1_FirstProgramme;

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
        Restaurant restaurantobj=(Restaurant)context.getBean(beanName);
        
        restaurantobj.greetCustomer();
    }
}
