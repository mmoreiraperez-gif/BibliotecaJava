package modelos;

import excepciones.LibroNoDisponibleException;
import excepciones.LibroNoPrestadoException;

public class Libro {

    private String isbn;
    private String titulo;
    private String autor;
    private boolean disponible;

    public Libro(String isbn, String titulo, String autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
    }

    // ==========================
    // Getters
    // ==========================

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isDisponible() {
        return disponible;
    }

    // ==========================
    // Métodos principales
    // ==========================

    public void prestar() throws LibroNoDisponibleException {

        // TODO:
        // Verificar si el libro ya está prestado.
        // Si no está disponible, lanzar LibroNoDisponibleException.
        // Si está disponible, cambiar disponible a false.

    }

    public void devolver() throws LibroNoPrestadoException {

        // TODO:
        // Verificar si el libro realmente estaba prestado.
        // Si ya estaba disponible, lanzar LibroNoPrestadoException.
        // En caso contrario, cambiar disponible a true.

    }

    @Override
    public String toString() {

        // TODO:
        // Mostrar ISBN, título, autor y estado del libro.
        // Formato sugerido:
        // ISBN: ...
        // Título: ...
        // Autor: ...
        // Estado: Disponible / Prestado

        return titulo;
    }

}