package org.CCristian.Optional.Ejemplo;

import java.util.Optional;

public class Ejemplo_Optional {
    public static void main(String[] args) {
        String nombre = "Andrés";

        System.out.println("=========================Nombre contiene un valor=========================");
        Optional<String> opt = Optional.of(nombre);
        /*Usar '.of' solo si estamos seguros de que el valor no es 'nulo'*/

        System.out.println("opt = " + opt);

        System.out.println("opt.isPresent(): " + opt.isPresent());

        if (opt.isPresent()){
            System.out.println("if (opt.isPresent(TRUE)) ---> Hola " + opt.get());
        }

        System.out.println("opt.isEmpty() = " + opt.isEmpty());

        opt.ifPresent( valor ->  /*Si contiene un valor realiza una determinada acción*/
            System.out.println("opt.ifPresent(TRUE) ---> Hola " + valor)
        );

        System.out.println("=========================Nombre NO contiene un valor=========================");
        nombre = null;
        opt = Optional.ofNullable(nombre);  /*Usar 'ofNullable' en caso de que el valor pueda ser 'nulo'*/
        System.out.println("opt = " + opt);
        System.out.println("opt.isPresent(): " + opt.isPresent());
        if (opt.isPresent()){
            System.out.println("if (opt.isPresent(TRUE)) ---> Hola " + opt.get());
        }else {
            System.out.println("if (opt.isPresent(FALSE)) ---> No está presente");
        }

        System.out.println("opt.isEmpty() = " + opt.isEmpty());
        opt.ifPresent( valor ->  /*Si contiene un valor realiza una determinada acción*/
                System.out.println("(opt.isPresent(TRUE)) ---> Hola " + valor)
        );

        opt.ifPresentOrElse(
                valor -> System.out.println("if (opt.isPresent(TRUE)) ---> Hola " + valor),   /*En caso de que contenga un valor*/
                () -> System.out.println("if (opt.isPresent(FALSE)) ---> No está presente")    /*En caso de que NO contenga un valor*/
        );

        System.out.println("=========================Nombre contiene un NUEVO valor=========================");
        nombre = "Cristian";
        opt = Optional.ofNullable(nombre);
        System.out.println("opt = " + opt);
        System.out.println("opt.isPresent(): " + opt.isPresent());
        if (opt.isPresent()){
            System.out.println("if (opt.isPresent(TRUE)) ---> Hola " + opt.get());
        }else {
            System.out.println("if (opt.isPresent(TRUE)) ---> No está presente");
        }

        System.out.println("opt.isEmpty() = " + opt.isEmpty());
        opt.ifPresent( valor ->  /*Si contiene un valor realiza una determinada acción*/
                System.out.println("opt.ifPresent(TRUE) ---> Hola " + valor)
        );

        opt.ifPresentOrElse(
                valor -> System.out.println("opt.ifPresent(TRUE) ---> Hola " + valor),   /*En caso de que contenga un valor*/
                () -> System.out.println("opt.ifPresent(FALSE) ---> No está presente")    /*En caso de que NO contenga un valor*/
        );

        
        System.out.println("=========================Trabajando con 'Optional.empty'=========================");
        Optional<String> optEmpty = Optional.empty();
        System.out.println("optEmpty = " + optEmpty);
        System.out.println("optEmpty.isPresent() = " + optEmpty.isPresent());
    }
}
