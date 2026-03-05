package com.mz.ig.core.entity;

import java.io.Serializable;

import com.mz.ig.shared_domain.entity.LifeCycleEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Table(name = "CENTRAL")
@Entity
@SequenceGenerator(name = "GENERATOR", sequenceName = "CENTRAL_SEQUENCE", initialValue = 1, allocationSize = 1)
public class CentralEntity extends LifeCycleEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "NAME")
	private String name;

	@Column(name = "ADRESS")
	private String adress;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

}
