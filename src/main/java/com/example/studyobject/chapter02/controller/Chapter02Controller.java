package com.example.studyobject.chapter02.controller;

import com.example.studyobject.chapter02.entity.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/chapter02")
public class Chapter02Controller {

    @GetMapping("/movie")
    public ResponseEntity<List<Movie>> movie() {
        //아바타 영화 생성
        Movie avatar = new Movie(
                "아바타",
                Duration.ofMinutes(120),
                Money.wons(10000),
                new AmountDiscountPolicy(
                        Money.wons(800),
                        new SequenceCondition(1),
                        new SequenceCondition(10),
                        new PeriodCondition(DayOfWeek.MONDAY, LocalTime.of(10, 0),LocalTime.of(11,59)),
                        new PeriodCondition(DayOfWeek.THURSDAY, LocalTime.of(10, 0),LocalTime.of(20,59))
                )
        );

        //타이타닉 영화 생성
        Movie titanic = new Movie(
                "타이타닉",
                Duration.ofMinutes(180),
                Money.wons(11000),
                new PercentDiscountPolicy(
                        0.1,
                        new PeriodCondition(DayOfWeek.TUESDAY, LocalTime.of(14, 0),LocalTime.of(16,59)),
                        new SequenceCondition(2),
                        new PeriodCondition(DayOfWeek.THURSDAY, LocalTime.of(10, 0),LocalTime.of(13,59))
                )
        );

        List<Movie> movieList = new ArrayList<>();
        movieList.add(avatar);
        movieList.add(titanic);

        return ResponseEntity.ok()
                .body(movieList);

    }

}
