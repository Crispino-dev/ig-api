package com.mz.ig.core.service;

import com.mz.ig.core.entity.CentralEntity;
import com.mz.ig.core.entity.UserEntity;

public interface ICentralService {

	public CentralEntity createCentral(UserEntity loggedUser, CentralEntity central);

}
