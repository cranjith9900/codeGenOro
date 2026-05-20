package com.oro.codegen.service.imp;

import com.oro.codegen.dto.subscription.CheckoutRequest;
import com.oro.codegen.dto.subscription.CheckoutResponse;
import com.oro.codegen.dto.subscription.PortalResponse;
import com.oro.codegen.dto.subscription.SubscriptionResponse;
import com.oro.codegen.service.SubscriptionService;
import org.springframework.stereotype.Service;

@Service
public class SubscriptionServiceimp implements SubscriptionService {
    @Override
    public SubscriptionResponse getCurrentSubscription(Long userId) {
        return null;
    }

    @Override
    public CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request, Long userId) {
        return null;
    }

    @Override
    public PortalResponse openCustomerPortal(Long userId) {
        return null;
    }
}
