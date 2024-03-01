package org.CCristian.Optional.Ejemplo;

import org.CCristian.Optional.Ejemplo.Models.Computador;
import org.CCristian.Optional.Ejemplo.Repositorio.Computador_Repositorio;
import org.CCristian.Optional.Ejemplo.Repositorio.Repositorio_Interface;


import java.util.Random;

public class Ejemplo_Repositorio_orElse {
    public static void main(String[] args) {

        Repositorio_Interface<Computador> repositorio = new Computador_Repositorio();

        System.out.println("========================='orElse'=========================");
        Computador pc = repositorio.filtrar("rog")  /*'filtrar' devuelve un objeto de tipo 'Computador'*/
        /*En caso de que no exista ese objeto*/.orElse(valorPorDefecto());   /*'orElse' devolverá un objeto del mismo tipo por defecto*/
        /*En caso de que exista ese objeto seguirá intentando invocar el método 'valorPorDefecto'*/
        System.out.println("orElse --> pc = " + pc);

        System.out.println("========================='orElseGet'=========================");

        pc = repositorio.filtrar("macbook pro")
                        .orElseGet(
                                () -> valorPorDefecto()  /*'orElseGet' trabaja con una expresión Lambda*/
                        );
        System.out.println("orElseGet --> pc = " + pc);
    }

    public static Computador valorPorDefecto (){
        String[] nombreDefecto = {"Apple","Dell","HP (Hewlett-Packard)", "Lenovo", "Asus", "Acer", "Toshiba", "Sony", "Samsung", "MSI", "Huawei", "Gateway", "Fujitsu", "Panasonic", "Microsoft (Surface)",};
        String[] modeloDefecto ={"MacBook Pro", "Dell XPS 13", "HP Spectre x360", "Lenovo ThinkPad X1 Carbon", "Asus ROG Zephyrus G14", "Acer Predator Helios 300", "Toshiba Portégé X30", "Sony VAIO S", "Samsung Galaxy Book S", "MSI GS65 Stealth", "Huawei MateBook X Pro", "Gateway Creator Series", "Fujitsu Lifebook U939X", "Panasonic Toughbook CF-33", "Microsoft Surface Laptop 4"};
        System.out.println("Obteniendo valor por defecto");
        Random random = new Random();
        int numero_random = random.nextInt(15);
        return new Computador(nombreDefecto[numero_random], modeloDefecto[numero_random]);
    }
}
