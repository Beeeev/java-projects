/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stoplight;

import java.util.Scanner;

/**
 *
 * @author lbevins
 */
public class StopLight {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a color code");
         int trafficColor = sc.nextInt();
         switch (trafficColor)
         {
             case 1:
                   System.out.println("Next Traffic Light is green");
                   break;
             case 2: 
                   System.out.println("Next Traffic Light is yellow");
                   break;
             case 3:
                   System.out.println("Next Traffic Light is red");
                   break;
             default:
                 System.out.println("Invalid Color");
         
         }
        
        sc.close ();
    }
    
}
