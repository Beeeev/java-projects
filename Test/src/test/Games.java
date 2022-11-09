/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author lbevins
 */
public class Games {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        private final int creditsRequired = 50;
    public Games(Card card1, Card card2) {
        
        {
            
            int rndTicketWin = rnd.nextInt(100000) + 70000;
            int addTickets = rndTicketWin + card1.getTicketBal();
            card1.setTicketBal(addTickets);
            int newCredits = card1.getCardBal() - creditsRequired;
            card1.setCardBal(newCredits);

            if(card1.getCardBal() <= 50)
                {
                    System.out.println("Credit Balance is too low!");
                 
                }
            //check for crdits
            //subtract credits
            //pick a random tickets(print)
            //add tickets to the card
            //tell them card total
            
        }
            int rndTicketWin = rnd.nextInt(70) + 10;
            int addTickets = rndTicketWin + card2.getTicketBal();
            card2.setTicketBal(addTickets);
            int newCredits = card2.getCardBal() - creditsRequired;
            card2.setCardBal(newCredits);
            
            
            if(card2.getCardBal() <= 0)
                {
                    System.out.println("Credit Balance is 0!");
                }
        }
        
  
      
    
    
          
        


    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public int getG() {
        return g;
    }

    public void setG(int g) {
        this.g = g;
    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }
   

    @Override
    public String toString() {
        return "Games{" + "sc=" + sc + ", rnd=" + rnd + ", credits=" + credits + ", g=" + g + '}';
    }
    
    
    
}
