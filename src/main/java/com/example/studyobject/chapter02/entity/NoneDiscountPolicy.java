package com.example.studyobject.chapter02.entity;

public class NoneDiscountPolicy extends DiscountPolicy{

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return Money.ZERO;
    }

}
