package com.example.studyobject.chapter02.sj_custom;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Movie {

    private String title;
    private int fee;
    private DiscountPolicy discountPolicy;
    private List<DiscountCondition> discountConditionList;

}
