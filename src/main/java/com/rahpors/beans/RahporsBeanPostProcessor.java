package com.rahpors.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by ramon on 28/08/17.
 */
public class RahporsBeanPostProcessor implements BeanPostProcessor{

    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("bean processor before  "+s);
        return o;
    }

    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("bean processor after  "+s);
        return o;
    }
}
