/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;


import java.util.Scanner;

/**
 *
 * @author lbevins
 */
public class Terminal {
        Scanner sc = new Scanner(System.in);
        private int takePrize = 1;
        private int prizeCost = 100;
        private boolean creditZero = false;
        private boolean checkTickets = false;
        Prizes prize1;
        Prizes prize2;
        Prizes prize3;
    public Terminal(Card card1, Card card2, Games myGame, Prizes myPrize) {
        System.out.println("Enter PIN to check balances: ");
        int enterPIN = sc.nextInt();
        int PIN1 = card1.getCardNum();
        int PIN2 = card2.getCardNum();
        
        if(PIN1 == enterPIN)
        {
            System.out.println("Your Credit balance is: " + card1.getCardBal());
            System.out.println("Your Ticket balance is: " + card1.getTicketBal());
            System.out.println("Purchase credits for card 1, 2 credits for $1");
            int creditsRequest = sc.nextInt();
            int creditsPurchased = creditsRequest * 2;
            int addCredits = creditsPurchased + card1.getCardBal();
            card1.setCardBal(addCredits);
            System.out.println("Your new balance is " + card1.getCardBal());
        }
        else if(PIN2 == enterPIN)
        {
            System.out.println("Your Credit balance is: " + card2.getCardBal());
            System.out.println("Your Ticket balance is: " + card2.getTicketBal());
            System.out.println("Purchase credits for card 2, 2 credits for $1");
            int creditsRequest = sc.nextInt();
            int creditsPurchased = creditsRequest * 2;
            int addCredits2 = creditsPurchased + card2.getCardBal();
            card2.setCardBal(addCredits2);
            System.out.println("Your new balance is " + card2.getCardBal()); 
        }
       
        

        int transCredit = card1.getCardBal() + card2.getCardBal();
        card2.setCardBal(transCredit);
        System.out.println("Card 1 transferred " + card1.getCardBal() + " credits to Card 2");
        System.out.println("Card 2 new  credit balance is " + card2.getCardBal());
        card1.setCardBal(0);
        
        int transTicket = card1.getTicketBal() + card2.getTicketBal();
        card2.setTicketBal(transTicket);
        System.out.println("Card 1 transferred " + card1.getTicketBal() + " tickets to Card 2");
        System.out.println("Card 2 new ticket balance is " + card2.getTicketBal());
        card1.setTicketBal(0);
       
        while(card1.getTicketBal() >= 100)
        {
            System.out.println("Enter PIN for card 1 to purchase prize: ");
            int enterPrizePIN = sc.nextInt();
            creditZero = false;
            checkTickets = true;
            System.out.println("Request prize 1 (elephant) or prize 2 (tiger)");
            int finalTickets = card2.getTicketBal();
            int prizeNum = sc.nextInt();
            
         if(card1.getTicketBal() < 100)
           {
            creditZero = true;
            System.out.println("Not enough tickets!");
           }
            
        if(prizeNum == 1 && PIN1 == enterPrizePIN && creditZero == false )
        {
            System.out.println("You chose prize 1 (elephant), enjoy");
            int prizesLeft = myPrize.getElephant() - takePrize; 
            myPrize.setElephant(prizesLeft);
            int prizeAmount = card1.getTicketBal() - prizeCost;
            card1.setTicketBal(prizeAmount);
            System.out.println("Card 1 new balance after prize: " + card1.getTicketBal());
        }
        else if(prizeNum == 2 && PIN1 == enterPrizePIN && creditZero == false)
        {
            System.out.println("You chose prize 2 (tiger), enjoy");
            int prizesLeft = myPrize.getTiger() - takePrize; 
            myPrize.setTiger(prizesLeft);
            int prizeAmount = card1.getTicketBal() - prizeCost;
            card1.setTicketBal(prizeAmount);
            System.out.println("Card 1 new balance after prize: " + card1.getTicketBal());
        }
            
       
      }

        while(card2.getTicketBal() >= 100)
        {
            checkTickets = true;
            creditZero = false;
            System.out.println("Enter PIN card 2 to purchase prize: ");
            int enterPrizePIN = sc.nextInt();
            System.out.println("Request prize 1 (elephant) or prize 2 (tiger)");
            int finalTickets = card2.getTicketBal();
            int prizeNum = sc.nextInt();
            if(prizeNum == 1 && PIN2 == enterPrizePIN && creditZero == false)
        {
        if(card2.getTicketBal() < 100)
        {
            creditZero = true;
            System.out.println("Not enough tickets!");
        }
        
        }
        if(prizeNum == 1 && PIN2 == enterPrizePIN && creditZero == false)
        {
            System.out.println("You chose prize 1 (elephant), enjoy");
            int prizesLeft = myPrize.getElephant() - takePrize; 
            myPrize.setElephant(prizesLeft);
            int prizeAmount = card2.getTicketBal() - prizeCost;
            card2.setTicketBal(prizeAmount);
            System.out.println("Card 2 new balance after prize: " + card2.getTicketBal());
        }
        else if(prizeNum == 2 && PIN2 == enterPrizePIN && creditZero == false)
        {
            System.out.println("You chose prize 2 (tiger), enjoy");
            int prizesLeft = myPrize.getTiger() - takePrize; 
            myPrize.setTiger(prizesLeft);
            int prizeAmount = card2.getTicketBal() - prizeCost;
            card2.setTicketBal(prizeAmount);
            System.out.println("Card 2 new balance after prize: " + card2.getTicketBal());
            
        }
            
           if(myPrize.getElephant() == 0)
          {
            creditZero = true;
            System.out.println("Out of elephants!");
          }
           if(myPrize.getTiger() == 0)
          {
            creditZero = true;
            System.out.println("Out of tigers!");
          } 
        }
        
//        if(prizeNum == 1 && PIN1 == enterPrizePIN && creditZero == false )
//        {
//            System.out.println("You chose prize 1 (elephant), enjoy");
//            int prizesLeft = myPrize.getElephant() - takePrize; 
//            myPrize.setElephant(prizesLeft);
//            int prizeAmount = card1.getTicketBal() - prizeCost;
//            card1.setTicketBal(prizeAmount);
//            System.out.println("Card 1 new balance after prize: " + card1.getTicketBal());
//        }
//        else if(prizeNum == 2 && PIN1 == enterPrizePIN && creditZero == false)
//        {
//            System.out.println("You chose prize 2 (tiger), enjoy");
//            int prizesLeft = myPrize.getTiger() - takePrize; 
//            myPrize.setTiger(prizesLeft);
//            int prizeAmount = card1.getTicketBal() - prizeCost;
//            card1.setTicketBal(prizeAmount);
//            System.out.println("Card 1 new balance after prize: " + card1.getTicketBal());
//        }
        
        
//        if(prizeNum == 1 && PIN2 == enterPrizePIN && creditZero == false)
//        {
//            System.out.println("You chose prize 1 (elephant), enjoy");
//            int prizesLeft = myPrize.getElephant() - takePrize; 
//            myPrize.setElephant(prizesLeft);
//            int prizeAmount = card2.getTicketBal() - prizeCost;
//            card2.setTicketBal(prizeAmount);
//            System.out.println("Card 2 new balance after prize: " + card2.getTicketBal());
//        }
//        else if(prizeNum == 2 && PIN2 == enterPrizePIN && creditZero == false)
//        {
//            System.out.println("You chose prize 2 (tiger), enjoy");
//            int prizesLeft = myPrize.getTiger() - takePrize; 
//            myPrize.setTiger(prizesLeft);
//            int prizeAmount = card2.getTicketBal() - prizeCost;
//            card2.setTicketBal(prizeAmount);
//            System.out.println("Card 2 new balance after prize: " + card2.getTicketBal());
            
         
          
        public void addCredits(Card card, int money)
      {
      }
      public void printBalance(Card card)
      {
      }
      public void transferCredits(Card cardGiving, Card cardRecieing)
      {
      }
      public void transferTickets(Card cardGiving, Card cardRecieing)
      {
      }  
      public void buyPrizes(Card card, Prizes prize)
      {
      }
    }
 

    public int getTakePrize() {
        return takePrize;
    }

    public void setTakePrize(int takePrize) {
        this.takePrize = takePrize;
    }

    public int getPrizeCost() {
        return prizeCost;
    }

    public void setPrizeCost(int prizeCost) {
        this.prizeCost = prizeCost;
    }
    

    @Override
    public String toString() {
        return "Terminal{" + "takePrize=" + takePrize + ", prizeCost=" + prizeCost + '}';
    }
    

    
    
     
        
}
