package com.example.studyobject.chapter02.sj_custom;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Screening {

    private Movie movie;
    private String whereScreened;
    private LocalDateTime whenScreened;
    private int sequence;
    //더 나은 것은 Theater 클래스 만들고, 거기에 상영관 이름과 상영관 속성, 자리 매핑하고 거기에 Map으로 자리 구현이라 생각
    private int leftSeatCount;
}
