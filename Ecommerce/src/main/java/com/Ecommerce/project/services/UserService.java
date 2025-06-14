package com.Ecommerce.project.services;

;

import com.Ecommerce.project.dtos.UserDTO;
import com.Ecommerce.project.models.User;

import java.util.List;

public interface UserService {
    void updateUserRole(Long userId, String roleName);

    List<User> getAllUsers();

    UserDTO getUserById(Long id);
}
