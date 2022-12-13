package br.com.curso.udemy.database.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrePersist;
import java.time.LocalDateTime;
import java.util.List;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Data
@Entity(name = "curso")
public class Curso {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String nome;
  private String area;
  @CreationTimestamp
  private LocalDateTime dataCriacao;
  @UpdateTimestamp
  private LocalDateTime dataAtualizacao;
  private String usuario;
  @OneToMany(mappedBy = "curso")
  private List<Aluno> alunos;

  public Curso() {

  }

  public Curso(String nome, String area) {
    this.nome = nome;
    this.area = area;
  }

  @PrePersist
  private void antesPersisitirDados() {
    this.usuario = "Admin";
  }
}
