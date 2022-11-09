/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string.assignment;

import java.util.Scanner;

/**
 *
 * @author lbevins
 */
public class StringAssignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
       
        System.out.println("What is your name?");
        
            String name = sc.nextLine();
            String lastName = name.substring(name.indexOf(' ') , name.length());
            String firstIntial = name.substring(0 , 1);
            
        System.out.println("Your name is: " + lastName + ", " + firstIntial);
        System.out.println(name.indexOf(' '));
        
        sc.close ();
    }
    
}
