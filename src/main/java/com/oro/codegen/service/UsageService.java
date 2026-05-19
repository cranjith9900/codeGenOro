package com.oro.codegen.service;


import com.oro.codegen.dto.subscription.PlanLimitsResponse;
import com.oro.codegen.dto.subscription.UsageTodayResponse;

public interface UsageService {
     UsageTodayResponse getTodayUsageOfUser(Long userId);

    PlanLimitsResponse getCurrentSubscriptionLimitsOfUser(Long userId);
}
