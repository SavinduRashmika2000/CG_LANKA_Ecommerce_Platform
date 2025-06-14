package com.Ecommerce.project.repositories;


import com.Ecommerce.project.models.AppRole;
import com.Ecommerce.project.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByRoleName(AppRole appRole);

}