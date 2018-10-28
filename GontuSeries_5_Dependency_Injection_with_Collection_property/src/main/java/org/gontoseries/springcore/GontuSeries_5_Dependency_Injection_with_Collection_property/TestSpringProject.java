package org.gontoseries.springcore.GontuSeries_5_Dependency_Injection_with_Collection_property;

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
        
        restaurantobj.displayWaitersNames();
    }
}
