package br.com.curso.udemy.database.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;
import lombok.Data;

@Data
@Entity
public class Materia {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  private String nome;
  @ManyToMany
  @JoinTable(name = "grade_materia", joinColumns = {
      @JoinColumn(name = "materia_id", referencedColumnName = "id")
  },
      inverseJoinColumns = {
          @JoinColumn(name = "grade_id", referencedColumnName = "id")
      })
  private Set<GradeCurricular> grades = new HashSet<>();

  public Materia(String nome, Set<GradeCurricular> grades) {
    this.nome = nome;
    this.grades = grades;
  }

  public Materia() {
  }
}
