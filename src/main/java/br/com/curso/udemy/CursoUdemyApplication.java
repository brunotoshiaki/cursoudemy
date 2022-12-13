package br.com.curso.udemy;

import br.com.curso.udemy.database.entities.Aluno;
import br.com.curso.udemy.database.entities.Curso;
import br.com.curso.udemy.database.entities.GradeCurricular;
import br.com.curso.udemy.database.entities.Materia;
import br.com.curso.udemy.database.entities.repositories.AlunoRepository;
import br.com.curso.udemy.database.entities.repositories.CursoRepository;
import br.com.curso.udemy.database.entities.repositories.GradeCurricularRepository;
import br.com.curso.udemy.database.entities.repositories.MateriaRepository;
import java.util.HashSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication()
public class CursoUdemyApplication implements CommandLineRunner {

  @Autowired
  CursoRepository cursoRepository;

  @Autowired
  AlunoRepository alunoRepository;

  @Autowired
  GradeCurricularRepository gradeCurricularRepository;

  @Autowired
  MateriaRepository materiaRepository;

  public static void main(String[] args) {
    SpringApplication.run(CursoUdemyApplication.class, args);
  }

  public void run(String... args) {
    var curso1 = new Curso("Graduação em TI", "Exatas");
    var curso2 = new Curso("Graduação em Economia", "Humanas");
    var aluno1 = new Aluno("Carlos", curso1);
    var gradeCurricular = new GradeCurricular("Graduação", aluno1);
    var gradesCurricular = new HashSet<GradeCurricular>();

    gradesCurricular.add(gradeCurricular);
    var m1 = new Materia("Complicadores", gradesCurricular);

    cursoRepository.save(curso1);
    cursoRepository.save(curso2);
    alunoRepository.save(aluno1);
    gradeCurricularRepository.save(gradeCurricular);
    materiaRepository.save(m1);

  }

}
