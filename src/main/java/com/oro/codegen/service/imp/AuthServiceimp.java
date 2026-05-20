package com.oro.codegen.service.imp;

import com.oro.codegen.dto.auth.AuthResponse;
import com.oro.codegen.dto.auth.LoginRequest;
import com.oro.codegen.dto.auth.SignupRequest;
import com.oro.codegen.service.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceimp implements AuthService {
    @Override
    public AuthResponse signup(SignupRequest request) {
        return null;
    }

    @Override
    public AuthResponse login(LoginRequest request) {
        return null;
    }
}
