package com.example.studyobject.chapter02.sj_custom;

public class SequenceCondition implements DiscountCondition<Integer>{

    private int sequence;

    @Override
    public boolean isMeetedCondition(Integer testSubject) {
        return sequence == testSubject;
    }
    
}
