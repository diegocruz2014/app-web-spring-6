package medellin.biblioteca.appwebspring6.bootstrap;

import medellin.biblioteca.appwebspring6.domain.Autor;
import medellin.biblioteca.appwebspring6.domain.Libro;
import medellin.biblioteca.appwebspring6.repositories.AutorRepository;
import medellin.biblioteca.appwebspring6.repositories.LibroRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    // Primero creo dos instancias, tanto de Repositorio de autor como en el repositorio de libro
    private final AutorRepository autorRepository;
    private final LibroRepository libroRepository;

    // Luego, haciendo uso de Intellig IDEA, con Alt + Intro voy a generar el constructor
    public BootstrapData(AutorRepository autorRepository, LibroRepository libroRepository) {
        this.autorRepository = autorRepository;
        this.libroRepository = libroRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        // Autor 1
        Autor eric = new Autor();
        eric.setNombres("Eric");
        eric.setApellidos("Evans");

        // Libro 1
        Libro ddd = new Libro();
        ddd.setTitulo("Domain Driven Design");
        ddd.setIsbn("123456");

        // Guardar los registros
        Autor ericSaved = autorRepository.save(eric);
        Libro dddSaved = libroRepository.save(ddd);

        // Autor 2 Rod Johnson => Fundador de Spring Framework
        Autor rod = new Autor();
        rod.setNombres("Rod");
        rod.setApellidos("Johnson");

        // Libro 2
        Libro noEJB = new Libro();
        noEJB.setTitulo("J2EE Development without EJB");
        noEJB.setIsbn("987654321");

        // Nuevamente guardamos los registros
        Autor rodSaved = autorRepository.save(rod);
        Libro noEJBSaved = libroRepository.save(noEJB);

        // Establecemos la asociación entre autores y libros
        ericSaved.getLibros().add(dddSaved);
        rodSaved.getLibros().add(noEJBSaved);

        // Verifiar la cuenta de los elementos almacenados
        System.out.println("En Bootstrap");
        System.out.println("Cuenta da Autores: " + autorRepository.count());
        System.out.println("Cuenta de Libros: " + libroRepository.count());

    }
}