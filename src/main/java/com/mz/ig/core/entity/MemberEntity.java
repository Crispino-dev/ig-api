package com.mz.ig.core.entity;

import java.io.Serializable;
import java.time.LocalDate;

import com.mz.ig.shared_domain.entity.LifeCycleEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Table(name = "MEMBER")
@Entity
@SequenceGenerator(name = "GENERATOR", sequenceName = "MEMBER_SEQUENCE", initialValue = 1, allocationSize = 1)
public class MemberEntity extends LifeCycleEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "NAME")
	private String name;

	@Column(name = "SURNAME")
	private String surname;

	@Column(name = "GENDER")
	private char gender;

	@Column(name = "BITHDATE")
	private LocalDate bithdate;

	@Column(name = "PHONE_NUMBER")
	private String phoneNumber;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "AGE_RANGE")
	private String ageRange;

	@Column(name = "AGE")
	private String age;

	@Column(name = "EDUCATION")
	private String education;

	@Column(name = "CENTRAL_ID")
	private Long centralId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CENTRAL_ID", insertable = false, updatable = false)
	private CentralEntity central;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public LocalDate getBithdate() {
		return bithdate;
	}

	public void setBithdate(LocalDate bithdate) {
		this.bithdate = bithdate;
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

	public String getAgeRange() {
		return ageRange;
	}

	public void setAgeRange(String ageRange) {
		this.ageRange = ageRange;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public Long getCentralId() {
		return centralId;
	}

	public void setCentralId(Long centralId) {
		this.centralId = centralId;
	}

	public CentralEntity getCentral() {
		return central;
	}

	public void setCentral(CentralEntity central) {
		this.setCentralId(central == null ? null : central.getId());
		this.central = central;
	}

}
