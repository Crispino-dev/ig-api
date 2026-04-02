package com.mz.ig.core.entity;

import java.io.Serializable;
import com.mz.ig.shared_domain.entity.LifeCycleEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "ESCOLA")
public class EscolaEntity extends LifeCycleEntity implements Serializable {

   
    
    private String nome;
    private String contacto;
    private String email;

    public EscolaEntity() {
    	
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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