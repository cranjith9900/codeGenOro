package com.oro.codegen.service.imp;

import com.oro.codegen.dto.subscription.PlanResponse;
import com.oro.codegen.service.PlanService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanServiceimp  implements PlanService {
    @Override
    public List<PlanResponse> getAllActivePlans() {
        return List.of();
    }
}
