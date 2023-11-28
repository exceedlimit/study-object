package com.example.studyobject.chapter02.book.entity;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SequenceCondition implements DiscountCondition {

    private int sequence;

    @Override
    public boolean isSatisfiedBy(Screening screening) {
        return screening.isSequence(sequence);
    }
    
}
