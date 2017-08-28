package com.rahpors.spring;

import com.rahpors.beans.Jugador;
import com.rahpors.beans.Persona;
import com.rahpors.interfaces.IEquipo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ramon on 25/08/17.
 */


public class AppXmlInterfaces {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com.rahpros.xml/beans2.xml");
        Jugador m = (Jugador) applicationContext.getBean("Messi");
        System.out.println(m.toString());
        IEquipo e = (IEquipo) applicationContext.getBean("equipo1");
        System.out.println(e.mostrar());
        ((ConfigurableApplicationContext) applicationContext).close();

    }


}
