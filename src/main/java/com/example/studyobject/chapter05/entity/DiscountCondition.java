package com.example.studyobject.chapter05.entity;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class DiscountCondition {

    /*
    
    private DiscountConditionType type;
    private int sequence;
    private DayOfWeek dayOfWeek;
    private LocalTime startTime;
    private LocalTime endTime;

    public boolean isSatisfiedBy(Screening screening) {
        if (type == DiscountConditionType.PERIOD) {
            return isSatisfiedByPeriod(screening);
        }

        return isSatisfiedBySequence(screening);
    }

    public boolean isSatisfiedByPeriod(Screening screening) {
        return dayOfWeek.equals(screening.getWhenScreened().getDayOfWeek()) &&
                startTime.compareTo(screening.getWhenScreened().toLocalTime()) <= 0 &&
                endTime.isAfter(screening.getWhenScreened().toLocalTime());
    }

    public boolean isSatisfiedBySequence(Screening screening) {
        return sequence == screening.getSequence();
    }

     */

}
