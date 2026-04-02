package com.mz.ig.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mz.ig.core.entity.SchoolEntity;
import com.mz.ig.core.entity.UserEntity;
import com.mz.ig.core.repository.ISchoolRepository;
import com.mz.ig.core.exception.ResourceNotFoundException;

/**
 * Arnancio Langane
 */
@Service
public class SchoolServiceImpl implements ISchoolService {

	@Autowired
	private ISchoolRepository schoolRepository;

	@Override
	public SchoolEntity createSchool(UserEntity loggedUser, SchoolEntity school) {
		return this.schoolRepository.save(school);
	}

	public List<SchoolEntity> findAll() {
		return this.schoolRepository.findAll();
	}

        @Override
        public SchoolEntity updateSchoolById(UserEntity loggedUser, Long id,SchoolEntity school){
        SchoolEntity updatedSchool = this.schoolRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("school not found"));
                     updatedSchool.setName(school.getName());
                     updatedSchool.setContact(school.getContact());
                     updatedSchool.setEmail(school.getEmail());
                     updatedSchool.setAddress(school.getAddress());
                     updatedSchool.setPhoneNumber(school.getPhoneNumber());
                     updatedSchool.setNuit(school.getNuit());

                     return this.schoolRepository.save(updatedSchool);
        }

   


}
