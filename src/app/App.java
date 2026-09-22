package app;

import java.util.Scanner;

import modelos.Libro;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Libro[] biblioteca = {

            new Libro("978-01", "Java Básico", "Ana Pérez"),
            new Libro("978-02", "Python para Todos", "Luis Soto"),
            new Libro("978-03", "Bases de Datos", "María López")

        };

        int opcion;

        do {

            mostrarMenu();

            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {

                case 1:

                    // TODO:
                    // Mostrar todos los libros utilizando mostrarLibros()

                    break;

                case 2:

                    // TODO:
                    // Solicitar el número del libro.
                    // Llamar al método prestar().
                    // Manejar las excepciones correspondientes.

                    break;

                case 3:

                    // TODO:
                    // Solicitar el número del libro.
                    // Llamar al método devolver().
                    // Manejar las excepciones correspondientes.

                    break;

                case 0:

                    System.out.println("Hasta pronto.");

                    break;

                default:

                    System.out.println("Opción no válida.");

            }

        } while (opcion != 0);

        scanner.close();

    }

    public static void mostrarMenu() {

        System.out.println("\n===============================");
        System.out.println(" SISTEMA DE BIBLIOTECA");
        System.out.println("===============================");
        System.out.println("1. Mostrar libros");
        System.out.println("2. Prestar libro");
        System.out.println("3. Devolver libro");
        System.out.println("0. Salir");
        System.out.println();

    }

    public static void mostrarLibros(Libro[] biblioteca) {

        // TODO:
        // Recorrer el arreglo utilizando un ciclo.
        // Mostrar cada libro junto con su número.
        //
        // Ejemplo:
        //
        // 1. Java Básico
        // 2. Python para Todos

    }

}