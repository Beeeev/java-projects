/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whileloopex;

/**
 *
 * @author lbevins
 */
public class WhileLoopEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int i = 10;
        
        while(i > 0)
        {
           
            System.out.println(i--);
            if(i == 5)
            {
             break;
            }
        }
        System.out.println("Blast off!");
    }
    
}
