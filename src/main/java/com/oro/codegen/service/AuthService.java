package com.oro.codegen.service;

import com.oro.codegen.dto.auth.AuthResponse;
import com.oro.codegen.dto.auth.LoginRequest;
import com.oro.codegen.dto.auth.SignupRequest;

public interface AuthService {
     AuthResponse signup(SignupRequest request);
     AuthResponse login(LoginRequest request);
}
