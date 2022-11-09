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
public class Prizes {
    private int elephant = 2;
    private int tiger = 2;
    Scanner sc = new Scanner(System.in);

    public Prizes(Card card1, Card card2, Games myGame) {
//        System.out.println("Request prize 1 (elephant) or prize 2 (tiger)");
//        int prizeNum = sc.nextInt();
//        System.out.println("Enter PIN to purchase prize: ");
//        int enterPIN = sc.nextInt();
//        int finalTickets = card2.getTicketBal();
//        int PIN1 = card1.getCardNum();
//        int PIN2 = card2.getCardNum();
//        
//        if(elephant == 0)
//        {
//            System.out.println("Out of elephants!");
//        }
//        if(tiger == 0)
//        {
//            System.out.println("Out of tigers!");
//        }
//        
//        if(prizeNum == 1 && PIN1 == enterPIN )
//        {
//            System.out.println("You chose prize 1 (elephant), enjoy");
//            elephant = elephant - 1 ; 
//            int prizeAmount = card1.getTicketBal() - 100;
//            card1.setTicketBal(prizeAmount);
//            System.out.println("Card 1 new balance after prize: " + card1.getTicketBal());
//        }
//        else if(prizeNum == 2 && PIN1 == enterPIN )
//        {
//            System.out.println("You chose prize 2 (tiger), enjoy");
//            tiger = tiger - 1 ;
//            int prizeAmount = card1.getTicketBal() - 100;
//            card1.setTicketBal(prizeAmount);
//            System.out.println("Card 1 new balance after prize: " + card1.getTicketBal());
//        }
//        
//        
//        if(prizeNum == 1 && PIN2 == enterPIN)
//        {
//            System.out.println("You chose prize 1 (elephant), enjoy");
//            elephant = elephant - 1 ; 
//            int prizeAmount = card2.getTicketBal() - 100;
//            card2.setTicketBal(prizeAmount);
//            System.out.println("Card 1 new balance after prize: " + card1.getTicketBal());
//        }
//        else if(prizeNum == 2 && PIN2 == enterPIN)
//        {
//            System.out.println("You chose prize 2 (tiger), enjoy");
//            tiger = tiger - 1 ;
//            int prizeAmount = card2.getTicketBal() - 100;
//            card2.setTicketBal(prizeAmount);
//            System.out.println("Card 1 new balance after prize: " + card1.getTicketBal());
//        }
//        myGame.setG(1);
        
        
    }

    public int getElephant() {
        return elephant;
    }

    public void setElephant(int elephant) {
        this.elephant = elephant;
    }

    public int getTiger() {
        return tiger;
    }

    public void setTiger(int tiger) {
        this.tiger = tiger;
    }

    @Override
    public String toString() {
        return "Prizes{" + "elephant=" + elephant + ", tiger=" + tiger + '}';
    }
    
    
}

