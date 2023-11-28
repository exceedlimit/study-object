package com.example.studyobject.chapter02.sj_custom;

import java.time.LocalDateTime;

public class PeriodCondition implements DiscountCondition<LocalDateTime>{

    private LocalDateTime conditionStartTime;
    private LocalDateTime conditionEndTime;

    @Override
    public boolean isMeetedCondition(LocalDateTime testSubject) {

        return conditionStartTime.isAfter(testSubject) && conditionEndTime.isBefore(testSubject);
        
    }
    
}
