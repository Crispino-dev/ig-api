package com.mz.ig.core.entity;

import java.io.Serializable;
import com.mz.ig.shared_domain.entity.LifeCycleEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

@Entity
@Table(name = "PROFESSOR")
public class ProfessorEntity extends LifeCycleEntity implements Serializable {

    private String nome;
    
    @Column(unique = true)
    private String nuit; 
    private String especialidade; 
    private String contacto;
    private String email;

    
    public ProfessorEntity() {
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNuit() {
        return nuit;
    }

    public void setNuit(String nuit) {
        this.nuit = nuit;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}