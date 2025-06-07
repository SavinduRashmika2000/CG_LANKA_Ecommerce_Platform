package com.Ecommerce.project.services;

import com.Ecommerce.project.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class AppUserService implements UserDetailsService {

    private final static String USER_NOT_FOUND_MSG="user with email %s not found";
    private final UserRepository appUserRepository;

    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        return appUserRepository.findByUsername(name)
                .orElseThrow(()->new UsernameNotFoundException(String.format(USER_NOT_FOUND_MSG,name)));

    }
}
