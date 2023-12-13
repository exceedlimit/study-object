package com.example.studyobject.chapter04.entity;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class Screening {
    private Movie movie;
    private int sequence;
    private LocalDateTime whenScreened;
}
