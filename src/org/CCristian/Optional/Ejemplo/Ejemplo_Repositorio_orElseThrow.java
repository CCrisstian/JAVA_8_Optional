package org.CCristian.Optional.Ejemplo;

import org.CCristian.Optional.Ejemplo.Models.Computador;
import org.CCristian.Optional.Ejemplo.Repositorio.Computador_Repositorio;
import org.CCristian.Optional.Ejemplo.Repositorio.Repositorio_Interface;

import java.util.Optional;

public class Ejemplo_Repositorio_orElseThrow {
    public static void main(String[] args) {

        Repositorio_Interface<Computador> repositorio = new Computador_Repositorio();

        System.out.println("========================='orElseThrow'=========================");
        Computador pc = repositorio.filtrar("rog").orElseThrow(IllegalStateException::new);
        /*En caso de que no exista el valor lanza una Excepción por defecto*/
        System.out.println("orElseThrow --> pc = " + pc);

        String archivo = "documento.pdf";

        String extension = Optional
                                    .ofNullable(archivo)    /*No lanzará una excepción si el valor proporcionado es nulo*/
                                    .filter(a -> a.contains("."))   /*Filtra elementos según un predicado*/
                                    .map(a -> a.substring(archivo.lastIndexOf(".")+1))  /*Transformar cada elemento*/
    /*El método 'substring' se utiliza para extraer una subcadena de una cadena más grande*/
    /*El método 'lastIndexOf' se utiliza para encontrar la última ocurrencia de un carácter o una subcadena dentro de una cadena*/
                                    .orElseThrow(); /*Devuelve el valor contenido en el Optional si está presente; de lo contrario lanza la excepción*/
        System.out.println("orElseThrow --> extension = " + extension);
    }
}
