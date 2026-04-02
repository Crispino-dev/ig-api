package com.mz.ig.core.repository;

import com.mz.ig.core.entity.AvaliacaoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface IAvaliacaoRepository extends JpaRepository<AvaliacaoEntity, Long> {
    List<AvaliacaoEntity> findByAlunoId(Long alunoId);
    List<AvaliacaoEntity> findByDisciplinaId(Long disciplinaId);
}