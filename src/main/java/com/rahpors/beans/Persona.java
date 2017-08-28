package com.rahpors.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by ramon on 25/08/17.
 */
public class Persona{ // implements InitializingBean,DisposableBean{
    private int id;
    private String nombre;
    private String apodo;
    private Pais pais;


//    public Persona(int id, String nombre, String apodo) {
//        this.id = id;
//        this.nombre = nombre;
//        this.apodo = apodo;
//    }
//
//    public Persona(int id) {
//        this.id = id;
//    }
//
//    public Persona(String apodo) {
//        this.apodo = apodo;
//    }

    @PostConstruct
    private void init(){
        System.out.println("Antes");
    }
    @PreDestroy
    private void destroy(){
        System.out.println("despues");
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }


    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apodo='" + apodo + '\'' +
                ", pais=" + pais.toString() +
                '}';
    }

//    public void afterPropertiesSet() throws Exception {
//        System.out.println("Antes");
//    }
//
//    public void destroy() throws Exception {
//        System.out.println("Despues");
//    }
}
