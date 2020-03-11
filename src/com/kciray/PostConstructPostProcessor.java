package com.kciray;

import org.springframework.beans.factory.config.BeanPostProcessor;

public class PostConstructPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) {
        System.out.println("PostConstructBeforeInitialization");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) {
        System.out.println("PostConstructAfterInitialization");
        return bean;
    }
}
