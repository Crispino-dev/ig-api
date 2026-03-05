package com.mz.ig.core.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mz.ig.core.repository.IUserRepository;

@Component
public class UserRepositoryProvider {

	private static IUserRepository userRepository;

	@Autowired
	public UserRepositoryProvider(IUserRepository repo) {
		userRepository = repo;
	}

	public static IUserRepository getRepository() {
		return userRepository;
	}
}
