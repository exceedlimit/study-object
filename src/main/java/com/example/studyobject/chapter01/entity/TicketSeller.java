package com.example.studyobject.chapter01.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class TicketSeller {

    private TicketOffice ticketOffice;

    public void sellTo(Audience audience){
        ticketOffice.sellTicketTo(audience);
    }
}
