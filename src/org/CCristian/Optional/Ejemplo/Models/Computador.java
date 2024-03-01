package org.CCristian.Optional.Ejemplo.Models;

import java.util.Optional;

public class Computador {
/*-----------------ATRIBUTOS-----------------*/
     private String nombre;
     private String modelo;
     private Procesador procesador;
/*-----------------GETTER-SETTER-----------------*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Optional<Procesador> getProcesador() {
        return Optional.ofNullable(procesador);
    }

    public void setProcesador(Procesador procesador) {
        this.procesador = procesador;
    }
/*-----------------CONSTRUCTOR-----------------*/
    public Computador(String nombre, String modelo) {
        this.nombre = nombre;
        this.modelo = modelo;
    }
/*-----------------MÉTODOS-----------------*/
    @Override
    public String toString() {
        return "Computador" +
                "\tNombre: '" + nombre + "'"+
                "\tModelo: '" + modelo + "'";
    }
}
