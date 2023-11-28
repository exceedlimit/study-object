package com.example.studyobject.chapter02.book.entity;

import java.time.DayOfWeek;
import java.time.LocalTime;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PeriodCondition implements DiscountCondition{

    private DayOfWeek dayOfWeek;
    private LocalTime startTime;
    private LocalTime endTime;

    @Override
    public boolean isSatisfiedBy(Screening screening) {
        return screening.getWhenScreened().getDayOfWeek().equals(dayOfWeek) &&
        startTime.compareTo(screening.getWhenScreened().toLocalTime()) <=0 && 
        endTime.compareTo(screening.getWhenScreened().toLocalTime())  >= 0;
    }
    
}
