/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arcade;

/**
 *
 * @author lbevins
 */
public class Card {
    private int credits;
    private int tickets;
    private final int cardNum;
    private static int nextCardNum = 1;

    public Card() {
        this.cardNum = nextCardNum++;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public int getTickets() {
        return tickets;
    }

    public void setTickets(int tickets) {
        this.tickets = tickets;
    }
    public static int getNextCardNum() {
        return nextCardNum;
    }
    
    
}

