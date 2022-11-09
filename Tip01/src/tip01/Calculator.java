/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tip01;

/**
 *
 * @author lbevins
 */
public class Calculator 
{
    
    public double taxRate = .05;
    public double tipRate = .15;
    
    public double findTotal(double amount)
    {
        double customerTax = amount * taxRate;
        double customerTip = amount * tipRate;
        double customerTotal = customerTax + amount + customerTip;
        
        return customerTotal;
        
//        System.out.println("Amount: " + amount);  
//        System.out.println("Customer Tax: " + customerTax);
//        System.out.println("Customer Tip: " + customerTip);
//        System.out.println("Customer Total: " + customerTotal);
//        System.out.println("----------------------------------");
    }
            
}

