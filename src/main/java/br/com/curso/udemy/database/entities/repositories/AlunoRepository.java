package br.com.curso.udemy.database.entities.repositories;

import br.com.curso.udemy.database.entities.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Integer> {

}
