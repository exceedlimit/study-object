package com.example.studyobject.chapter01.entity;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class TicketOffice {

    private Long amount;
    private List<Ticket> tickets;

    private Ticket getTicket(){
        return tickets.remove(0);
    }

    private void minusAmount(Long amount){
        this.amount -= amount;
    }

    private void plusAmount(Long amount){
        this.amount += amount;
    }

    public void sellTicketTo(Audience audience){
        plusAmount(audience.buy(getTicket()));
    }

}
