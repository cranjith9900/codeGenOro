package com.oro.codegen.service;

import com.oro.codegen.dto.auth.UserProfileResponse;
import com.oro.codegen.dto.subscription.PlanLimitsResponse;

public interface UserService {
     UserProfileResponse getProfile(Long userId);
}
