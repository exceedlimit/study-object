package com.example.studyobject.chapter01.controller;

import com.example.studyobject.chapter01.entity.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/chapter01")
public class Chapter01Controller {



    @GetMapping("/go-theater")
    public Audience goTheater(Long amount, Boolean hasInvitation){

        if(amount == null || hasInvitation == null) return null;

        Audience audience;

        if(hasInvitation){
            Invitation invitation = new Invitation(LocalDateTime.now());
            audience = new Audience(new Bag(invitation, amount));
        }else{
            audience = new Audience(new Bag(amount));
        }

        List<Ticket> ticketList = new ArrayList();
        for(int i =0;i<100;i++){
            ticketList.add(new Ticket(1000L));
        }

        TicketSeller ticketSeller = new TicketSeller(new TicketOffice(0L, ticketList));

        Theater theater = new Theater(ticketSeller);

        theater.enter(audience);

        return audience;
    }
}
