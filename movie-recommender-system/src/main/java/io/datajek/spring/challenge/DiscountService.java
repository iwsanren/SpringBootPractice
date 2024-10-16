package io.datajek.spring.challenge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class DiscountService {
    private final DiscountStrategy discountDEF, discountBDS, discountMDS;
    private final List<DiscountStrategy> discountStrategies;

//    public DiscountService() {
//        this.discountDEF = new DefaultDiscountStrategy();
//        this.discountBDS = new BundleDiscountStrategy();
//        this.discountMDS = new MembershipDiscountStrategy();
//        this.discountStrategies = Arrays.asList(discountDEF, discountBDS, discountMDS);
//    }

    @Autowired
    public DiscountService(DiscountStrategy defaultDiscount,
                           @Qualifier("BDS") DiscountStrategy bundleDiscount,
                           @Qualifier("MDS") DiscountStrategy membershipDiscount,
                           List<DiscountStrategy> discountStrategies) {
        this.discountDEF = defaultDiscount;
        this.discountBDS = bundleDiscount;
        this.discountMDS = membershipDiscount;
        this.discountStrategies = discountStrategies;
    }
    public double applyDefaultDiscount(double originalPrice) {
        return discountDEF.applyDiscount(originalPrice);
    }

    public double applyBundleDiscount(double originalPrice) {
        return discountBDS.applyDiscount(originalPrice);
    }

    public double applyMembershipDiscount(double originalPrice) {
        return discountMDS.applyDiscount(originalPrice);
    }

    public double applyAllDiscounts(double originalPrice) {
        double discountedPrice = originalPrice;
        for (DiscountStrategy strategy : discountStrategies) {
            discountedPrice = strategy.applyDiscount(discountedPrice);
        }
        return discountedPrice;
    }
}
