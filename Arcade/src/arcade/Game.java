/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arcade;

import java.util.Random;

/**
 *
 * @author lbevins
 */
public class Game {

    private final int creditsRequired = 5;
    Random rnd = new Random();

    public Game() {

    }

    public void play(Card card) {
        if (card.getCredits() <= 5) {
            System.out.println("Credit Balance is too low!");

        } else {
            int rndTicketWin = rnd.nextInt(49) + 30;
            int addTickets = rndTicketWin + card.getTickets();
            card.setTickets(addTickets);
            int newCredits = card.getCredits() - creditsRequired;
            card.setCredits(newCredits);
        }
    }



}
