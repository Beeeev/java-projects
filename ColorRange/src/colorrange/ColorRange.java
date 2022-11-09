/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colorrange;

import java.util.Scanner;

/**
 *
 * @author lbevins
 */
public class ColorRange {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
         System.out.println("Enter a wavelength");
         double waveNum = sc.nextDouble();
          
         
         if (waveNum  >= 380 && waveNum < 450 )
         {
           System.out.println("The color is Violet");  
         }
         else if(waveNum  >= 450 && waveNum < 495)
         {
           System.out.println("The color is Blue"); 
         }
         else if(waveNum >= 495 && waveNum < 570)
         {
           System.out.println("The color is Green");
         }
         else if(waveNum  >= 570 && waveNum < 590)
         {
           System.out.println("The color is Yellow"); 
         }
         else if(waveNum >= 590 && waveNum < 620)
         {
           System.out.println("The color is Orange"); 
         }
         else if(waveNum  >= 620 && waveNum < 750)
         {
           System.out.println("The color is Red"); 
         }
         else 
         {
           System.out.println("The entered wavelength is not a part of the visible spectrum"); 
         }
        
         
        sc.close ();
    }
    
}
