package org.gontoseries.springcore.GontuSeries_14_BeanFactoryPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class DemoBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

		BeanDefinition beandefinition=beanFactory.getBeanDefinition("restaurantBean");
		MutablePropertyValues propertyValues=beandefinition.getPropertyValues();
		
		propertyValues.addPropertyValue("welcomeNote", "Oberio will serve best than JW");
	}
	
	

}
