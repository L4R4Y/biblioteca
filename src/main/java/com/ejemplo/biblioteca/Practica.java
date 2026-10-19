
package com.ejemplo.biblioteca;

public class Practica {

    public static void main(String[] args) {

        // Crear tres objetos de tipo Libro
        Libro libro1 = new Libro(
                "Cien años de soledad",
                "Gabriel García Márquez",
                1967
        );

        Libro libro2 = new Libro(
                "El principito",
                "Antoine de Saint-Exupéry",
                1943
        );

        Libro libro3 = new Libro(
                "Harry Potter y la piedra filosofal",
                "J. K. Rowling",
                1997
        );

        // Imprimir el resumen de cada libro
        System.out.println(libro1.resumen());
        System.out.println(libro2.resumen());
        System.out.println(libro3.resumen());

        // Comprobar si cada libro es antiguo
        System.out.println("¿Libro 1 es antiguo? " + libro1.esAntiguo());
        System.out.println("¿Libro 2 es antiguo? " + libro2.esAntiguo());
        System.out.println("¿Libro 3 es antiguo? " + libro3.esAntiguo());

        // Consultar los atributos mediante getters
        System.out.println("Título del libro 1: " + libro1.getTitulo());
    }

    public static int calcularMulta(int diasRetraso) {
        return diasRetraso * 500;
    }
}

