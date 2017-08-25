package com.rahpors.beans;

import org.springframework.beans.factory.annotation.Value;

/**
 * Created by ramon on 25/08/17.
 */
public class Mundo {
    @Value("Hola Annotations")
    private String saludo;

    public String getSaludo() {
        return saludo;
    }

    public void setSaludo(String saludo) {
        this.saludo = saludo;
    }
}
