package app;

import java.util.Scanner;

import excepciones.LibroNoDisponibleException;
import excepciones.LibroNoPrestadoException;
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
                    mostrarLibros(biblioteca);
                    break;

                case 2:
                    System.out.print("Ingrese el número del libro a prestar: ");
                    int numPrestar = scanner.nextInt();
                    if (numPrestar >= 1 && numPrestar <= biblioteca.length) {
                        try {
                            biblioteca[numPrestar - 1].prestar();
                            System.out.println("Libro prestado con éxito.");
                        } catch (LibroNoDisponibleException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                    } else {
                        System.out.println("Número de libro no válido.");
                    }
                    break;

                case 3:
                    System.out.print("Ingrese el número del libro a devolver: ");
                    int numDevolver = scanner.nextInt();
                    if (numDevolver >= 1 && numDevolver <= biblioteca.length) {
                        try {
                            biblioteca[numDevolver - 1].devolver();
                            System.out.println("Libro devuelto con éxito.");
                        } catch (LibroNoPrestadoException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                    } else {
                        System.out.println("Número de libro no válido.");
                    }
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
        for (int i = 0; i < biblioteca.length; i++) {
            System.out.println((i + 1) + ". " + biblioteca[i].getTitulo());
        }
    }

}