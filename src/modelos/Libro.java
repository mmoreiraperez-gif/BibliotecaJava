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
        if (!disponible) {
            throw new LibroNoDisponibleException("El libro ya está prestado.");
        }
        disponible = false;
    }

    public void devolver() throws LibroNoPrestadoException {
        if (disponible) {
            throw new LibroNoPrestadoException("El libro no estaba prestado.");
        }
        disponible = true;
    }

    @Override
    public String toString() {
        return "ISBN: " + isbn + "\n" +
               "Título: " + titulo + "\n" +
               "Autor: " + autor + "\n" +
               "Estado: " + (disponible ? "Disponible" : "Prestado");
    }

}