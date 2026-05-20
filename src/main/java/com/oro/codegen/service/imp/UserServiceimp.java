package com.oro.codegen.service.imp;

import com.oro.codegen.dto.auth.UserProfileResponse;
import com.oro.codegen.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceimp implements UserService {
    @Override
    public UserProfileResponse getProfile(Long userId) {
        return null;
    }
}
