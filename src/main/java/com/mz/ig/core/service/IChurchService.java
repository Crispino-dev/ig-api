package com.mz.ig.core.service;

import com.mz.ig.core.entity.ChurchEntity;
import com.mz.ig.core.entity.UserEntity;

public interface IChurchService {

	public ChurchEntity createChurch(UserEntity loggedUser, ChurchEntity church);

}
