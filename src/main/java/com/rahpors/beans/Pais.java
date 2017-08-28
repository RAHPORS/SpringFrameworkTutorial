package com.rahpors.beans;

import java.util.List;

public class Pais {
    private String name;

    public void setCiudad(List<Ciudad> ciudad) {
        this.ciudad = ciudad;
    }

    private List<Ciudad> ciudad;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "name='" + name + '\'' +
                ", ciudades=" + ciudad +
                '}';
    }
}
