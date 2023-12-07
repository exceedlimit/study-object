package com.example.studyobject.chapter02.entity;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Reservation {

    private Customer customer;
    private Screening screening;
    private Money fee;
    private int audienceCount;

}
