/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loopexmaple;

import java.util.Scanner;

/**
 *
 * @author lbevins
 */
public class Loopexmaple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int total = 0;
        for(int i = 1;i <= 100; i++)
        {
            System.out.println(i + " Total: " + total);
            total += i;
            
        }
        System.out.println("Total:" + total);
    }
    
}
