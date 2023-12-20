package com.example.studyobject.chapter05.entity;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class Screening {

    // 외부에서 사용되지 않는 movie가 존재한다면, @Getter를 사용하지 말아야 하는가?
    private Movie movie;
    private int sequence;
    private LocalDateTime whenScreened;

    public Reservation reserve(Customer customer, int audienceCount) {
        // 영화 예매의 최종 목적은 Reservation 인스턴스를 생성하는 것
        return new Reservation(customer, this, calculateFee(audienceCount), audienceCount);
    }

    private Money calculateFee(int audienceCount) {
        // movie를 호출하면서 메시지만을 던짐
        // screening 입장에서 movie에 대한 정보는 모르는 상태
        // screening과 movie 사이의 연결고리는 메시지 뿐
        // -> 메시지 기반으로 협력이 구성되어 결합도가 느슨한 상태
        return movie.calculateMovieFee(this).times(audienceCount);
    }

}
