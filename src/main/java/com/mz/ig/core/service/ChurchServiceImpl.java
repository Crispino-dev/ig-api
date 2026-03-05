package com.mz.ig.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mz.ig.core.entity.ChurchEntity;
import com.mz.ig.core.entity.UserEntity;
import com.mz.ig.core.repository.IChurchRepository;

@Service
public class ChurchServiceImpl  implements IChurchService{

	@Autowired
	private IChurchRepository churchRepository;

	@Override
	public ChurchEntity createChurch(UserEntity loggedUser, ChurchEntity church) {
		return this.churchRepository.save(church);
	}

}
