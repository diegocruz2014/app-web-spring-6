package medellin.biblioteca.appwebspring6.domain;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String titulo;
    private String isbn;

    // Relación entre Libro y Autor (es de muchos a muchos)
    @ManyToMany
    @JoinTable(name = "autor_libro", joinColumns = @JoinColumn(name = "id_libro"),
        inverseJoinColumns = @JoinColumn(name = "id_autor"))

    private Set<Autor> autores = new HashSet<>();

    // Relación entre lIbro y Editorial (es de muchos libros a una sola editorial)
    @ManyToOne
    //@JoinColumn(name = "id_editorial")
    private Editorial editorial;

    // Getter and Setter

    // Relación con Editorial
    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    // Relación con Autor
    public Set<Autor> getAutores() {
        return autores;
    }

    public void setAutores(Set<Autor> autores) {
        this.autores = autores;
    }

    // Atributos (propiedades) de Book
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    // Volver a generar el método "toString()" para involucrar a la editorial, o
    // incluir el parámetro "editorial" en este espacio
    @Override
    public String toString() {
        return "Libro{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", isbn='" + isbn + '\'' +
                ", editorial=" + editorial +
                ", autores=" + autores +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Libro libro = (Libro) o;
        return getId() == libro.getId();
    }

    @Override
    public int hashCode() {
        return Long.hashCode(getId());
    }


}
