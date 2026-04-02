package com.mz.ig.core.service;

import java.util.List;

import com.mz.ig.core.entity.SchoolEntity;
import com.mz.ig.core.entity.UserEntity;

/**
 * Arnancio Langane
 */
public interface ISchoolService {

	public SchoolEntity createSchool(UserEntity loggedUser, SchoolEntity school);

	public List<SchoolEntity> findAll();

        public SchoolEntity updateSchoolById(UserEntity loggedUser, Long id, SchoolEntity school);


}
