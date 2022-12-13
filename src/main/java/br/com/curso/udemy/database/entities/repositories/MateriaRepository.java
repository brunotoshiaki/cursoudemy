package br.com.curso.udemy.database.entities.repositories;

import br.com.curso.udemy.database.entities.Materia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MateriaRepository extends JpaRepository<Materia, Integer> {

}
