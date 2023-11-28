package com.example.studyobject.chapter02.sj_custom;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Reservation {
    
    private Screening screening;
    //더 나은 것은 각자 다 별도로 만드는 것 (Member, Seat)
    private String reservationPersion;
    private String Seat;

}
