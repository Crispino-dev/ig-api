package com.mz.ig.core.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Table(name = "CURSO")
@Entity
@SequenceGenerator(name = "GENERATOR", sequenceName = "CURSO_SEQUENCE", initialValue = 1, allocationSize = 1)
public class CursoEntity {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nome;

    @Column(unique = true, nullable = false, length = 20)
    private String codigo; 

    @Column(length = 255)
    private String descricao;

    private Integer duracaoSemestres;

 
   
 // Relacionamento com Disciplinas 
  //  @ManyToMany
   // @JoinTable(
       // name = "curso_disciplina",
     //   joinColumns = @JoinColumn(name = "curso_id"), // Corrigido aqui (estava @JoinColun)
     //   inverseJoinColumns = @JoinColumn(name = "disciplina_id")
  //  )
   // private List<DisciplinaEntity> disciplinas;

    
    @OneToMany(mappedBy = "curso", cascade = CascadeType.ALL)
    private List<TurmaEntity> turmas;



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getCodigo() {
		return codigo;
	}



	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}



	public String getDescricao() {
		return descricao;
	}



	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}



	public Integer getDuracaoSemestres() {
		return duracaoSemestres;
	}



	public void setDuracaoSemestres(Integer duracaoSemestres) {
		this.duracaoSemestres = duracaoSemestres;
	}



	public List<TurmaEntity> getTurmas() {
		return turmas;
	}



	public void setTurmas(List<TurmaEntity> turmas) {
		this.turmas = turmas;
	}
    
    
}
