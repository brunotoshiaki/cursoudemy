package br.com.curso.udemy.database.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Aluno {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String nome;
  @ManyToOne
  @JoinColumn(name = "curso_id")
  private Curso curso;

  public Aluno(String nome, Curso curso) {
    this.nome = nome;
    this.curso = curso;
  }

  public Aluno() {
  }
}
