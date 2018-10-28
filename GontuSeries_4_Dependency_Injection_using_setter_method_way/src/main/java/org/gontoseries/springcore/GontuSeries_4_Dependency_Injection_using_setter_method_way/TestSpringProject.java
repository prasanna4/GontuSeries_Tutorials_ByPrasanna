package org.gontoseries.springcore.GontuSeries_4_Dependency_Injection_using_setter_method_way;

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
        
        restaurantobj.prepareHotDrnk();
    }
}
