package com.example.studyobject.chapter04.entity;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class Movie {
    private String title;
    private Duration runningTime;
    private Money fee;
    private List<DiscountCondition> discountConditions;

    private MovieType movieType;
    private Money discountAmount;
    private double discountPercent;
}
