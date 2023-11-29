package com.example.studyobject.chapter02.book.entity;

public interface DiscountPolicy {
    Money calculateDiscountAmount(Screening screening);
    
}
