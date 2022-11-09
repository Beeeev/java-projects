/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pinloop;

import java.util.Scanner;

/**
 *
 * @author lbevins
 */
public class PinLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the PIN");
        int PIN = 1234;
        int userPIN = sc.nextInt();
        
        while(userPIN != PIN)
        {
           System.out.println("Incorrect PIN, try again");
           userPIN = sc.nextInt();
        }
        System.out.println("Correct PIN");
    }
    
}
