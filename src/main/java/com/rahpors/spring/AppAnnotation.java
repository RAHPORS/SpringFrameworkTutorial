package com.rahpors.spring;

import com.rahpors.beans.AppConfig;
import com.rahpors.beans.Mundo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ramon on 25/08/17.
 */


public class AppAnnotation {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Mundo m = (Mundo) applicationContext.getBean("mundo");
        System.out.println(m.getSaludo());
        ((ConfigurableApplicationContext)applicationContext).close();
    }


}
