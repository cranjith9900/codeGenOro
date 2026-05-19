package com.oro.codegen.service;


import com.oro.codegen.dto.subscription.CheckoutRequest;
import com.oro.codegen.dto.subscription.CheckoutResponse;
import com.oro.codegen.dto.subscription.PortalResponse;
import com.oro.codegen.dto.subscription.SubscriptionResponse;

public interface SubscriptionService {
    SubscriptionResponse getCurrentSubscription(Long userId);

    CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request, Long userId);

    PortalResponse openCustomerPortal(Long userId);
}
