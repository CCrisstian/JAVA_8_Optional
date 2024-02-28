package org.CCristian.Optional.Ejemplo.Repositorio;

import org.CCristian.Optional.Ejemplo.Models.Computador;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Computador_Repositorio implements Repositorio_Interface<Computador>{

/*-----------------ATRIBUTOS-----------------*/
    private List<Computador> dataSource = new ArrayList<>();
/*-----------------CONSTRUCTOR-----------------*/
    public Computador_Repositorio() {
        dataSource = new ArrayList<>(); /*Inicializar*/
        dataSource.add(new Computador("Asus ROG","Strix G512"));
        dataSource.add(new Computador("MacBook Pro","MVVK2CI"));
    }
/*-----------------MÉTODOS-----------------*/
    @Override
    public Optional<Computador> filtrar(String nombre) {
        return dataSource.stream()  /*Se convierte en un tipo 'Stream'*/
                .filter(c -> c.getNombre()  /*Obtiene el nombre*/
                        .toLowerCase()  /*Convierte el nombre en minúscula*/
                        .contains(nombre.toLowerCase()))    /*Solo pasan aquellos que contengan el valor suministrado*/
                /*Si el atributo 'Nombre' del objeto c contiene el valor suministrado cumplirá la condición del 'contains'*/
                .findFirst();   /*Devuelve el primero que haya cumplido con la condición*/
                /*También puede devolver un vacío en caso de que ninguno haya cumplido la condición del 'equals'*/
    }



    /*
         for (Computador c: dataSource){
            if (c.getNombre().equalsIgnoreCase(nombre)){
                return Optional.of(c);
            }
        }
        return Optional.empty();
    */


}
