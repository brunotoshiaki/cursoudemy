package br.com.curso.udemy;

import br.com.curso.udemy.database.entities.Curso;
import br.com.curso.udemy.database.entities.repositories.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication()
public class CursoUdemyApplication implements CommandLineRunner {

  @Autowired
  CursoRepository repository;

  public static void main(String[] args) {
    SpringApplication.run(CursoUdemyApplication.class, args);
  }

  public void run(String... args)  {
    Curso curso1 = new Curso("Graduação em TI", "Exatas");
    Curso curso2 = new Curso("Graduação em Economia", "Humanas");

    repository.save(curso1);
    repository.save(curso2);
  }

}
