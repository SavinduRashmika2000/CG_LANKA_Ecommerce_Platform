package com.Ecommerce.project.security;


import com.Ecommerce.project.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepository repo;

    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        return (UserDetails) repo.findByUsername(name)
                .orElseThrow(() -> new UsernameNotFoundException(name));
    }
}
