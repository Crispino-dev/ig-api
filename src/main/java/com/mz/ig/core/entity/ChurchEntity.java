package com.mz.ig.core.entity;

import java.io.Serializable;

import com.mz.ig.shared_domain.entity.LifeCycleEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Table(name = "CHURCH")
@Entity
@SequenceGenerator(name = "GENERATOR", sequenceName = "CHURCH_SEQUENCE", initialValue = 1, allocationSize = 1)
public class ChurchEntity extends LifeCycleEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "NAME")
	private String name;

	@Column(name = "ADRESS")
	private String adress;

	@Column(name = "PHONE_NUMBER")
	private String phoneNumber;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "FOUNDING_DATE")
	private String foundingDate;

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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFoundingDate() {
		return foundingDate;
	}

	public void setFoundingDate(String foundingDate) {
		this.foundingDate = foundingDate;
	}

}
