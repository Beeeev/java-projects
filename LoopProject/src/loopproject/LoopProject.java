/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loopproject;

import java.util.Scanner;

/**
 *
 * @author lbevins
 */
public class LoopProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        
        int multiple = sc.nextInt();
        int total = 0;
        
        for(int i = 1;i <= 12; i++)
        {
            total = i * multiple;
            System.out.println(i + " x " + multiple + " = " + total);
        }
         
         
    }
    
}
