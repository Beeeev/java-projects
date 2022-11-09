/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomdemo;

import java.util.Random;

/**
 *
 * @author lbevins
 */
public class RandomDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Random rnd = new Random(20);
        
        //for(int i=0; i<10; i++)
            // how to shift a number line from 0-9 to 1-10 
            //2 random numbers added together 1-6  
        System.out.println("Random int: " + (rnd.nextInt(10) +1));
            
//          double  myRoot = Math.sqrt(121);  
//        double radius = 5;
//        double area = Math.PI * Math.pow(radius, 2);
//        System.out.println(area);
    }
    
}
