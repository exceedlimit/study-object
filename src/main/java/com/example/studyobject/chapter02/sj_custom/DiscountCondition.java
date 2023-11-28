package com.example.studyobject.chapter02.sj_custom;

public interface DiscountCondition<T> {
    boolean isMeetedCondition(T testSubject);
}
