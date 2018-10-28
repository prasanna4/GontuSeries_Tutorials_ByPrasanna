package org.gontoseries.springcore.GontuSeries_13_Implementing_an_Ordered_interface_in_a_BeanPostProcessor_class;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

public class DemoBeanPostProcessor2 implements BeanPostProcessor, Ordered{

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("DemoBeanPostProcessor2:postProcessBeforeInitialization");
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("DemoBeanPostProcessor2:postProcessAfterInitialization");
		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}

	@Override
	public int getOrder() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
