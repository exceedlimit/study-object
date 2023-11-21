package com.example.studyobject.chapter01.after.entity;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Theater {

    private TicketSeller ticketSeller;

    public void enter(Audience audience){
        // 1. TicketOffice에 접근하는 모든 코드를 TicketSeller 내부로 숨기기 (TicketSeller-sellTo로 이동)
//        if(audience.getBag().hasInvitation()){
//            Ticket ticket = ticketSeller.getTicketOffice().getTicket();
//            audience.getBag().setTicket(ticket);
//        }else{
//            Ticket ticket = ticketSeller.getTicketOffice().getTicket();
//
//            audience.getBag().minusAmount(ticket.getFee());
//            ticketSeller.getTicketOffice().plusAmount(ticket.getFee());
//
//            audience.getBag().setTicket(ticket);
//        }
        //2. sellTo를 호출한다.
        ticketSeller.sellTo(audience);
    }
}
