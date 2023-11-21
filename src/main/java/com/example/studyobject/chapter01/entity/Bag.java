package com.example.studyobject.chapter01.entity;

import lombok.Getter;
import lombok.Setter;

//관람객이 소지품을 담을 용도로 가져올 가방
@Getter
public class Bag {

    //현금
    private Long amount;
    private Invitation invitation;
    @Setter
    private Ticket ticket;

    //이벤트 당첨자의 가방
    public Bag(Invitation invitation, long amount){
        this.invitation = invitation;
        this.amount = amount;
    }
    //이벤트 미당첨자의 가방
    public Bag(long amount){
        this(null, amount);
    }

    public Long hold(Ticket ticket){
        if(hasInvitation()){
            setTicket(ticket);
            return 0L;
        }else{
            setTicket(ticket);
            minusAmount(ticket.getFee());
            return ticket.getFee();
        }
    }

    private boolean hasInvitation(){
        return invitation != null;
    }

    public boolean hasTicket(){
        return ticket != null;
    }

    private void minusAmount(Long amount){
        this.amount -= amount;
    }

    private void plusAmount(Long amount){
        this.amount += amount;
    }


}
