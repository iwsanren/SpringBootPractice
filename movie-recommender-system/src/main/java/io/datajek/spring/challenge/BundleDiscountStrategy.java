package io.datajek.spring.challenge;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier("BDS")
@Component
public class BundleDiscountStrategy implements DiscountStrategy {
    @Override
    public double applyDiscount(double originalPrice) {
        // Apply discount based on bundled purchases
        return originalPrice * 0.9; // 10% discount
    }
}
