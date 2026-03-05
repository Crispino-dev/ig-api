package com.mz.ig.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mz.ig.core.entity.CentralEntity;
import com.mz.ig.core.entity.UserEntity;
import com.mz.ig.core.repository.ICentralRepository;

@Service
public class CentralServiceImpl implements ICentralService {

	@Autowired
	private ICentralRepository centralRepository;

	@Override
	public CentralEntity createCentral(UserEntity loggedUser, CentralEntity central) {
		return this.centralRepository.save(central);
	}

}
