package com.example.studyobject.chapter02.sj_custom;

public class PercentDiscountPolicy implements DiscountPolicy {

    private int discountPercent;

    @Override
    public int doDiscount(int fee) {
        return fee * (100-discountPercent)/100;
    }
    
}
