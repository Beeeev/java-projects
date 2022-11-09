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
public class Prizes {
    private final String prize; 
    private final int ticketCost = 50;
    private int prizeAmount = 3;

    public Prizes(String prize) {
        this.prize = prize;
    }

    public String getPrize() {
        return prize;
    }

    public int getTicketCost() {
        return ticketCost;
    }

    public int getPrizeAmount() {
        return prizeAmount;
    }
    
    public void removePrize()
    {
        prizeAmount--;
    }
    
    
}
