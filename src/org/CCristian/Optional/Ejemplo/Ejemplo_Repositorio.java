package org.CCristian.Optional.Ejemplo;

import org.CCristian.Optional.Ejemplo.Models.Computador;
import org.CCristian.Optional.Ejemplo.Repositorio.Computador_Repositorio;
import org.CCristian.Optional.Ejemplo.Repositorio.Repositorio_Interface;

import java.util.Optional;

public class Ejemplo_Repositorio {
    public static void main(String[] args) {

        Repositorio_Interface<Computador> repositorio = new Computador_Repositorio();
        /*Recordatorio- Cuando se crea la clase Computador_Repositorio ya contiene valores*/
        /*
        dataSource = new ArrayList<>();
        dataSource.add("Asus ROG","Strix G512"));
        dataSource.add("MacBook Pro","MVVK2CI"));
        */

        Optional<Computador> pc = repositorio.filtrar("asus rog");
        /*'filtrar' busca la clase que contenga el nombre provisto*/
        /*Devuelve un objeto del tipo 'Optional<Computador>'*/

        System.out.println("==========================Opción1-'If'======================================");
        if (pc != null){
            System.out.println("pc.getNombre() = " + pc.get().getNombre() + "\n");
        }else {
            System.out.println("No se encontró\n");
        }

        System.out.println("==========================Opción2-'Optional'======================================");
        /*Se realizaron cambios en la interfaz 'Repositorio_Interfaz'*/
        /*Se realizaron cambios en la interfaz 'Computador_Repositorio'*/
        /*La variable 'pc' almacena un valor del tipo 'Optional<Computador>'*/
        if (pc.isPresent()){
            System.out.println("pc.pc.get() = " + pc.get()+ "\n");
        }else {
            System.out.println("No se encontró\n");
        }

        System.out.println("==========================Opción3-'Optional.filtrar'======================================");
        Repositorio_Interface<Computador> repositorio2 = new Computador_Repositorio();
        repositorio2.filtrar("asus")
                .ifPresentOrElse(
                        System.out::println,
                        () -> System.out.println("No se encontró\n")
                );

    }
}
