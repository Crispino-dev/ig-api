package com.mz.ig.core.entity;

import java.io.Serializable;
import java.time.LocalDate;
import com.mz.ig.shared_domain.entity.LifeCycleEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "ALUNO")

public class AlunoEntity extends LifeCycleEntity implements Serializable {

   
    @Column(name = "numero_estudante", unique = true, nullable = false)
    private String numeroEstudante;

    private String nomeCompleto;
    private LocalDate dataNascimento;
    private String email;

    // Getters e Setters apenas para os campos desta classe
    public String getNumeroEstudante() {
        return numeroEstudante;
    }
    public void setNumeroEstudante(String numeroEstudante) {
        this.numeroEstudante = numeroEstudante;
    }
    public String getNomeCompleto() {
        return nomeCompleto;
    }
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}