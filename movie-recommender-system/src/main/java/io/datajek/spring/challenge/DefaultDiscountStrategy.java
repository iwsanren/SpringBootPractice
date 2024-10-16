package io.datajek.spring.challenge;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class DefaultDiscountStrategy implements DiscountStrategy {
    @Override
    public double applyDiscount(double originalPrice) {
        // Apply discount for online purchase
        return originalPrice * 0.95; // 5% discount
    }
}
