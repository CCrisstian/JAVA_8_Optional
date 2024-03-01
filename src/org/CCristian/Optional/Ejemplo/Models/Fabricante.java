package org.CCristian.Optional.Ejemplo.Models;

public class Fabricante {
/*-----------------ATRIBUTOS-----------------*/
    private String nombre;
/*-----------------GETTER-SETTER-----------------*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
/*-----------------CONSTRUCTOR-----------------*/
    public Fabricante(String nombre) {
        this.nombre = nombre;
    }
}
