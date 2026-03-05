package com.mz.ig.core.auth;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import com.mz.ig.core.entity.UserEntity;
import com.mz.ig.core.repository.IUserRepository;

@Component("auditorProvider")
public class AuditorAwareImpl implements AuditorAware<Long> {
	
	@Autowired
	private IUserRepository userRepository;
	
	@Override
	public Optional<Long> getCurrentAuditor() {
	    Authentication auth = SecurityContextHolder.getContext().getAuthentication();

	    if (auth == null || !auth.isAuthenticated()) {
	        return Optional.empty();
	    }

	    Object principal = auth.getPrincipal();

	    if (principal instanceof CustomUserDetails customUser) {
	        // Aqui já temos o ID direto
	        return Optional.of(customUser.getId());
	    } else if (principal instanceof org.springframework.security.core.userdetails.User springUser) {
	        // Mapper: buscar no banco pelo username e retornar o ID
	        String username = springUser.getUsername();
	        Optional<Long> userId = findUserIdByUsername(username);
	        return userId;
	    } else if (principal instanceof String username) {
	        // Quando só temos o username
	        Optional<Long> userId = findUserIdByUsername((String) principal);
	        return userId;
	    }

	    return Optional.empty();
	}

	// Exemplo de função que consulta o banco
	private Optional<Long> findUserIdByUsername(String username) {
	    // Aqui você injeta seu UserRepository e faz a consulta
	    return userRepository.findByUsername(username)
	                         .map(UserEntity::getId);
	}


}
