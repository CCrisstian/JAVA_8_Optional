package org.CCristian.Optional.Ejemplo.Repositorio;

import org.CCristian.Optional.Ejemplo.Models.Computador;

public interface Repositorio_Interface<T> {
    Computador filtrar(String nombre);
}
