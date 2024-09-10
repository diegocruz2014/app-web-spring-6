package medellin.biblioteca.appwebspring6.domain;

import jakarta.persistence.*;

import java.awt.print.Book;
import java.util.Set;

@Entity
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id; // Este campo será usado para la persistencia en la base de datos
    private String nombres;
    private String apellidos;

    @ManyToMany(mappedBy = "autores")
    private Set<Libro> libros;

    // Getter and Setter
    // Relación con Book
    public Set<Libro> getLibros() {
        return libros;
    }

    public void setLibros(Set<Libro> libros) {
        this.libros = libros;
    }

    // Atributos (propiedades) de Autor
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
}
