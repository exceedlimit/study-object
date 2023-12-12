package com.example.studyobject.chapter02.book.entity;

import java.util.List;

public class AmountDiscountPolicy extends DefaultDiscountPolicy{
    
    private Money discountAmount;
    
    public AmountDiscountPolicy(Money discountAmount, List<DiscountCondition> conditions) {
        super(conditions);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return discountAmount;
    }

}