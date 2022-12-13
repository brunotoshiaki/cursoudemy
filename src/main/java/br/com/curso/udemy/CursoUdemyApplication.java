package br.com.curso.udemy;

import br.com.curso.udemy.database.entities.Aluno;
import br.com.curso.udemy.database.entities.Curso;
import br.com.curso.udemy.database.entities.repositories.AlunoRepository;
import br.com.curso.udemy.database.entities.repositories.CursoRepository;
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

  public static void main(String[] args) {
    SpringApplication.run(CursoUdemyApplication.class, args);
  }

  public void run(String... args) {
    Curso curso1 = new Curso("Graduação em TI", "Exatas");
    Curso curso2 = new Curso("Graduação em Economia", "Humanas");
    Aluno aluno1 = new Aluno("Carlos", curso1);

    cursoRepository.save(curso1);
    cursoRepository.save(curso2);
    alunoRepository.save(aluno1);

  }

}
