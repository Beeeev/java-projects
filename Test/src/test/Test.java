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
public class Test {
     
        
    public static void main(String[] args) {
        System.out.println("Each game cost 50 credits");
        Card myCard1 = new Card();
        Card myCard2 = new Card();
        
        Games myGame = new Games(myCard1, myCard2);
        Prizes myPrize = new Prizes(myCard1, myCard2, myGame);
        Terminal myTerminal = new Terminal(myCard1, myCard2, myGame, myPrize);
        
        
        
      
    }
 
    
}
