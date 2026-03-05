package com.mz.ig.core.auth;


import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

import com.mz.ig.core.entity.UserEntity;

public abstract class AbstractResource {

    /**
     * Retorna o usuário logado a partir do SecurityContext.
     */
    protected UserEntity getUserContext() {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        if (principal instanceof UserEntity user) {
            return user; // se você estiver armazenando UserEntity no Authentication
        } else if (principal instanceof UserDetails userDetails) {
            // Caso você só tenha UserDetails, você pode buscar o UserEntity pelo username
            return fetchUserEntityByUsername(userDetails.getUsername());
        }

        return null;
    }

    /**
     * Método para buscar UserEntity pelo username.
     * Pode ser implementado via repository.
     */
    private UserEntity fetchUserEntityByUsername(String username) {
        // Exemplo: injetar UserRepository (precisa ser @Autowired)
        return UserRepositoryProvider.getRepository().findByUsername(username)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado: " + username));
    }
}

