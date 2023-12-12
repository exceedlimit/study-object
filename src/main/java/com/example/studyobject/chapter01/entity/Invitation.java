package com.example.studyobject.chapter01.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;


@AllArgsConstructor
@Getter
public class Invitation {
    private LocalDateTime when;
}
