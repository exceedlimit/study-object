package com.example.studyobject.chapter02.book.entity;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class NoneDiscountPolicy implements DiscountPolicy{

    @Override
    public Money calculateDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
    
}
