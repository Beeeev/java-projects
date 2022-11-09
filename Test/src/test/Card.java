/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author lbevins
 */
public class Card {
    private int cardBal;
    private int ticketBal ;
    private int cardNum ;
    
    public Card(){
    }
    

    public Card(int cardBal, int ticketBal, int cardNum) {
        this.cardBal= cardBal;
        this.ticketBal = ticketBal;
        this.cardNum = cardNum;
    }

    public int getCardBal() {
        return cardBal;
    }

    public void setCardBal(int cardBal) {
        this.cardBal = cardBal;
    }

    public int getTicketBal() {
        return ticketBal;
    }

    public void setTicketBal(int ticketBal) {
        this.ticketBal = ticketBal;
    }

    public int getCardNum() {
        return cardNum;
    }

    public void setCardNum(int cardNum) {
        this.cardNum = cardNum;
    }

    @Override
    public String toString() {
        return "Card{" + "card balance=" + cardBal + ", ticket balance=" + ticketBal + ", Card number:"+ cardNum + '}';
    }
    
    
    
}
