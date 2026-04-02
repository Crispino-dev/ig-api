package com.mz.ig.core.repository;

import com.mz.ig.core.entity.EscolaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEscolaRepository extends JpaRepository<EscolaEntity, Long> {
	
}