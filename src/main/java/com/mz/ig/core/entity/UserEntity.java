package com.mz.ig.core.entity;

import java.io.Serializable;

import com.mz.ig.shared_domain.entity.LifeCycleEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "APP_USER")
@SequenceGenerator(name = "GENERATOR", sequenceName = "MEMBER_SEQUENCE", initialValue = 1, allocationSize = 1)
public class UserEntity  extends LifeCycleEntity implements Serializable{

	private static final long serialVersionUID = 1L;

	@Column(name = "USERNAME", unique = true, nullable = false)
	private String username;

	@Column(name = "EMAIL", unique = true, nullable = false)
	private String email;

	@Column(name = "PASSWORD", nullable = false)
	private String password;

	@Column(name = "ROLE", nullable = false)
	private String role; // ROLE_ADMIN, ROLE_MEMBER

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
