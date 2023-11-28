package com.example.studyobject.chapter02.book.entity;

import java.util.List;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class DiscountPolicy {
    
    private List<DiscountCondition> conditions;

    public Money calculateDiscountAmount(Screening screening) {

        for(DiscountCondition condition : conditions){
            if(condition.isSatisfiedBy(screening)){
                return getDiscountAmount(screening);
            }
        }

        return Money.ZERO;
    }

    abstract protected Money getDiscountAmount(Screening screening);
    
}
