package com.oro.codegen.service.imp;

import com.oro.codegen.dto.subscription.PlanLimitsResponse;
import com.oro.codegen.dto.subscription.UsageTodayResponse;
import com.oro.codegen.service.UsageService;
import org.springframework.stereotype.Service;

@Service
public class UsageServiceimp implements UsageService {
    @Override
    public UsageTodayResponse getTodayUsageOfUser(Long userId) {
        return null;
    }

    @Override
    public PlanLimitsResponse getCurrentSubscriptionLimitsOfUser(Long userId) {
        return null;
    }
}
