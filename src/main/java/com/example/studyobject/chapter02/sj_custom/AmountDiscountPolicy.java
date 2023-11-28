package com.example.studyobject.chapter02.sj_custom;

public class AmountDiscountPolicy implements DiscountPolicy {

    private int discountAmount;
    
    @Override
    public int doDiscount(int fee) {
        return fee - discountAmount;
    }
    
}
