package org.CCristian.Optional.Ejemplo.Models;

import java.util.Optional;

public class Procesador {
/*-----------------ATRIBUTOS-----------------*/
    private String nombre;
    private Fabricante fabricante;
/*-----------------GETTER-SETTER-----------------*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Optional<Fabricante> getFabricante() {
        return Optional.ofNullable(fabricante);
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }
/*-----------------CONSTRUCTOR-----------------*/
    public Procesador(String nombre, Fabricante fabricante) {
        this.nombre = nombre;
        this.fabricante = fabricante;
    }
}
