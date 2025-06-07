package com.Ecommerce.project.util;



import com.Ecommerce.project.models.Role;
import com.Ecommerce.project.models.User;
import com.Ecommerce.project.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.*;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {

    private final UserRepository repo;
    private final PasswordEncoder encoder;

    @Override
    public void run(String... args) {
        if (repo.findByUsername("admin").isEmpty()) {
            User admin = User.builder()
                    .username("admin")
                    .password(encoder.encode("password"))
                    .roles(List.of(Role.ROLE_ADMIN, Role.ROLE_USER))
                    .build();
            repo.save(admin);
        }
    }
}
