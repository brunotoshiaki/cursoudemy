package br.com.curso.udemy.database.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import java.util.HashSet;
import java.util.Set;
import lombok.Data;

@Data
@Entity(name = "Grade")
public class GradeCurricular {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  private String objetivo;
  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "aluno_id", referencedColumnName = "id")
  private Aluno aluno;

  @ManyToMany(mappedBy = "grades")
  private Set<Materia> materias = new HashSet<>();

  public GradeCurricular(String objetivo, Aluno aluno) {
    this.objetivo = objetivo;
    this.aluno = aluno;
  }

  public GradeCurricular() {
  }
}
