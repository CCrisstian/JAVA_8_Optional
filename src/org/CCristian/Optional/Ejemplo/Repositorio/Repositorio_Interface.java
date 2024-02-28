package org.CCristian.Optional.Ejemplo.Repositorio;

import java.util.Optional;

public interface Repositorio_Interface<T> {
    Optional<T> filtrar(String nombre);
    /*Optional<Computador> filtrar(String nombre);*/
    /*Computador filtrar(String nombre);*/
}
