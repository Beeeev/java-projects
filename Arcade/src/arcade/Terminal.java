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
public class Terminal {
        
        Prizes prize1 = new Prizes("Hat");
        Prizes prize2 = new Prizes("Candy");
        
        public void addCredits(Card card, int money){
            int creditAmount = money * 2;
            int totalCredits = card.getCredits() + creditAmount;
            card.setCredits(totalCredits);
           
      }
        public void printBalance(Card card){
            System.out.println("New credit balance is " + card.getCredits());
            System.out.println("New ticket balance is " + card.getTickets());
      }
        public void transferCredits(Card cardGiving, Card cardReceiving){
            int transferTotal = cardGiving.getCredits() + cardReceiving.getCredits();
            cardReceiving.setCredits(transferTotal);
            cardGiving.setCredits(0);
            
      }
        public void transferTickets(Card cardGiving, Card cardReceiving){
            int transferTotal = cardGiving.getTickets() + cardReceiving.getTickets();
            cardReceiving.setTickets(transferTotal);
            cardGiving.setTickets(0);
            
      }  
        public void buyPrizes(Card card, Prizes prize){
            if(card.getTickets() <= 50)
            {
                System.out.println("Not enough tickets for prizes");
            }
            prize.removePrize();
            int ticketAmount = card.getTickets() - prize.getTicketCost();
            card.setTickets(ticketAmount);
            
            if(prize.getPrizeAmount() == 0)
            {
                System.out.println("Out of Prizes!");
            }
                if(prize.getPrizeAmount() >= 1)
                {
                    System.out.println( prize.getPrizeAmount() +" prizes left!");
                }
      }
}
