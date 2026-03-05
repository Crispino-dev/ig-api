package com.mz.ig.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mz.ig.core.entity.MemberEntity;

@Repository
public interface IMemberRepository extends JpaRepository<MemberEntity, Long> {

}
