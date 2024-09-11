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

    @Override
    public String toString() {
        return "Autor{" +
                "id=" + id +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", libros=" + libros +
                '}';
    }

    // Còdigo generado por Intellig IDEA por la combinación de teclas Alt + Insert
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Autor autor = (Autor) o;
        return getId() == autor.getId();
    }

    @Override
    public int hashCode() {
        return Long.hashCode(getId());
    }

    /*
    // Còdigo generado por Intellig IDEA por la combinación de teclas Alt + Insert
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Autor)) return false;

        Autor autor = (Autor) o;

        return getId() != null ? getId().equals(autor.getId()) : autor.getId() == null;
    }

    @Override
    public int hashCode() {
        return getId() != null ? getId().hashcode() : 0;
    }
    */

}
