package com.rahpors.beans;

public class Pais {
    private String name;
    private Ciudad ciudad;

    @Override
    public String toString() {
        return "Pais{" +
                "name='" + name + '\'' +
                ", ciudad=" + ciudad +
                '}';
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
