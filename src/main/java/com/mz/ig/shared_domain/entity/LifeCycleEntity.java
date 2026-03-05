package com.mz.ig.shared_domain.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.UuidGenerator;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.SequenceGenerator;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class) 
public abstract class LifeCycleEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    // ===== ID =====
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GENERATOR")
    @SequenceGenerator(
        name = "GENERATOR",
        sequenceName = "GENERATOR_SEQ",
        allocationSize = 1
    )
    @Column(name = "ID", nullable = false)
    private Long id;

    // ===== UUID =====
    @Column(name = "UUID", nullable = false, unique = true, updatable = false)
    @UuidGenerator
    private UUID uuid;

    // ===== CREATED BY =====
    @CreatedBy
    @Column(name = "CREATED_BY", nullable = false, updatable = false)
    private Long createdBy;

    // ===== DATES =====
    @Column(name = "CREATION_DATE", nullable = false, updatable = false)
    private LocalDateTime creationDate;

    @Column(name = "UPDATE_DATE")
    private LocalDateTime updateDate;

    // ===== ACTIVE =====
    @Column(name = "ACTIVE", nullable = false)
    private boolean active = true;

    @PrePersist
    protected void onCreate() {
        this.creationDate = LocalDateTime.now();
        this.updateDate = LocalDateTime.now();
        this.active = true;
    }

    @PreUpdate
    protected void onUpdate() {
        this.updateDate = LocalDateTime.now();
    }

    // ===== GETTERS =====
    public Long getId() { return id; }
    public UUID getUuid() { return uuid; }
    public Long getCreatedBy() { return createdBy; }
    public LocalDateTime getCreationDate() { return creationDate; }
    public LocalDateTime getUpdateDate() { return updateDate; }
    public boolean isActive() { return active; }
}
