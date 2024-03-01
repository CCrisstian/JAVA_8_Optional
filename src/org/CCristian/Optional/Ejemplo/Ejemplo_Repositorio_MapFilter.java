package org.CCristian.Optional.Ejemplo;

import org.CCristian.Optional.Ejemplo.Models.Computador;
import org.CCristian.Optional.Ejemplo.Models.Fabricante;
import org.CCristian.Optional.Ejemplo.Models.Procesador;
import org.CCristian.Optional.Ejemplo.Repositorio.Computador_Repositorio;
import org.CCristian.Optional.Ejemplo.Repositorio.Repositorio_Interface;


public class Ejemplo_Repositorio_MapFilter {
    public static void main(String[] args) {

        Repositorio_Interface<Computador> repositorio = new Computador_Repositorio();

        System.out.println("========================='Map'-'Filter'=========================");

        String fabricante = repositorio.filtrar("rog")  /*Filtrar y obtener un elemento 'Computador'*/
                /*Repositorio_Interface<Computador> ---> Computador*/
                .flatMap(Computador::getProcesador) /*Obtener el atributo 'procesador'*/
                /*'flatMap' devuelve un 'Optional'*/
                /*public Optional<Procesador> getProcesador()*/
                /*Computador ---> Procesador*/
                .flatMap(Procesador::getFabricante) /*Obtener el atributo 'fabricante'*/
                /*'flatMap' devuelve un 'Optional'*/
                /*public Optional<Fabricante> getFabricante()*/
                /*Procesador ---> Fabricante*/
                .filter(f -> f.getNombre().equalsIgnoreCase("Intel"))   /*Filtra aquellos que cumplan la condición*/
                .map(Fabricante::getNombre)
                /*'map' devuelve un objeto*/
                /*Fabricante ---> nombreFabricante*/
                .orElse("Desconocido"); /*En caso de que no exista se lanza el valor por defecto*/

        System.out.println("fabricante = " + fabricante);
    }

}
