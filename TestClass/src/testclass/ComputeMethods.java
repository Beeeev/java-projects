/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testclass;

import java.util.Random;

/**
 *
 * @author lbevins
 */
public class ComputeMethods 
{
     public double fToC(double degreesF) 
     {
     double C = 5/9.0 * (degreesF-32.0);
     return C;
     }               
     public double hypotenuse(int a, int b)
     {
     double H = Math.pow(a, 2) + Math.pow(b, 2);
     double hypo = Math.sqrt(H);
     return hypo;
     }
     public int roll()
     {
     Random rnd = new Random();
     int die1 = rnd.nextInt(6) +1;
     int die2 = rnd.nextInt(6) +1;
     int dice = die1 + die2;
     return dice;
     }       
     
   
}
