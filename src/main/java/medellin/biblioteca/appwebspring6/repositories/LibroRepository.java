package medellin.biblioteca.appwebspring6.repositories;

import medellin.biblioteca.appwebspring6.domain.Libro;
import org.springframework.data.repository.CrudRepository;

public interface LibroRepository extends CrudRepository<Libro, Long> {
}
