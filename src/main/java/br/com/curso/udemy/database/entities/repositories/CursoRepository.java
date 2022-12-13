package br.com.curso.udemy.database.entities.repositories;

import br.com.curso.udemy.database.entities.Curso;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CursoRepository extends JpaRepository<Curso, Integer> {

  List<Curso> findCursoByNomeLikeIgnoreCase(final String nome);

  List<Curso> findCursoById(final Integer id);

  @Query(value = "Select nome from curso where area = :area", nativeQuery = true)
  List<String> findByQueryNomePorAreaInformada(@Param("area") final String area);


}
