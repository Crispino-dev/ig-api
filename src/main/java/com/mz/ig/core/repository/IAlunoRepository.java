package com.mz.ig.core.repository;

import com.mz.ig.core.entity.AlunoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface IAlunoRepository extends JpaRepository<AlunoEntity, Long> {
   
    Optional<AlunoEntity> findByEmail(String email);
}