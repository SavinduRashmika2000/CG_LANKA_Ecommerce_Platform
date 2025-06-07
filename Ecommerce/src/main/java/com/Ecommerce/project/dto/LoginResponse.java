package com.Ecommerce.project.dto;

import lombok.*;

@Data
@AllArgsConstructor
@Builder
public class LoginResponse {
    private String token;
}

