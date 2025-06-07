package com.Ecommerce.project.controllers;

import com.Ecommerce.project.models.RegistrationRequest;
import com.Ecommerce.project.services.RegistrationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping(path="/registration")
public class RegistrationController {
    private RegistrationService registrationService;
    public String register(@RequestBody RegistrationRequest request){
        return registrationService.register(request);
    }

}
