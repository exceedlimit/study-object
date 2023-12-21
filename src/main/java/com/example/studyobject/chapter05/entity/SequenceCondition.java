package com.example.studyobject.chapter05.entity;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SequenceCondition {

    private int sequence;

    public boolean isSatisfiedBy(Screening screening) {
        return sequence == screening.getSequence();
    }

}
