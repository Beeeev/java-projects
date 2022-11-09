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
public class Arcade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Card myCard1 = new Card();
        Card myCard2 = new Card();
        Game myGame = new Game();
        Terminal myTerminal = new Terminal();
        
        myTerminal.addCredits(myCard1, 15);
        myTerminal.addCredits(myCard2, 20);
        
       for(int i = 0;i<5; i++)
        {
            myGame.play(myCard1);
        }
       for(int i = 0;i<5; i++)
        {
            myGame.play(myCard2);
        }
        myTerminal.printBalance(myCard1);
        myTerminal.printBalance(myCard2);
        
       myTerminal.transferCredits(myCard1, myCard2);
       myTerminal.transferTickets(myCard1, myCard2);
        myTerminal.printBalance(myCard1);
        myTerminal.printBalance(myCard2);
        
        Prizes prize1 = new Prizes("Hat");
        Prizes prize2 = new Prizes("Candy");
       myTerminal.buyPrizes(myCard2, prize1);
       
       myGame.play(myCard1);
       
       myTerminal.buyPrizes(myCard2, prize1);
       myTerminal.buyPrizes(myCard2, prize1);
       
       myTerminal.buyPrizes(myCard1, prize2);
       myTerminal.buyPrizes(myCard1, prize2);
       myTerminal.buyPrizes(myCard1, prize2);
       myTerminal.buyPrizes(myCard1, prize2);
    }
    
}
