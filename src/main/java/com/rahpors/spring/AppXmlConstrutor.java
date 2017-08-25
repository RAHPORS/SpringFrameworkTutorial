package com.rahpors.spring;

import com.rahpors.beans.Mundo;
import com.rahpors.beans.Persona;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ramon on 25/08/17.
 */


public class AppXmlConstrutor {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com.rahpros.xml/beans.xml");
        Persona m = (Persona) applicationContext.getBean("persona");
        System.out.println(m.toString());
        ((ConfigurableApplicationContext)applicationContext).close();
    }


}
