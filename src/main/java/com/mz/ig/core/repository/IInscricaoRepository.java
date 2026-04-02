package com.mz.ig.core.repository;

import com.mz.ig.core.entity.InscricaoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface IInscricaoRepository extends JpaRepository<InscricaoEntity, Long> {
 
    List<InscricaoEntity> findByAlunoId(Long alunoId);
}