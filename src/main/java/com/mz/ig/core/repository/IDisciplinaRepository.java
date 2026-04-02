package com.mz.ig.core.repository;

import com.mz.ig.core.entity.DisciplinaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDisciplinaRepository extends JpaRepository<DisciplinaEntity, Long> {
    
    DisciplinaEntity findByNome(String nome);
}