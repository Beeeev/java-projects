/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orderprocessing;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.regex.Pattern;

/**
 *
 * @author lbevins
 */
public class OrderProcessor {
    const double tax = 0.02;
    const double shipping = 0.05;

    public OrderProcessor() {
        
    }
    ArrayList<String> Orders = new ArrayList<>();
    String[] newOrders;
    public void fileRead()
    { 
        try
        {
            BufferedReader fileInput = new BufferedReader(new FileReader
                (new File("/Users/lbevins/Desktop/Orders.txt")));
            String line = fileInput.readLine();
            while(line != null)   
            {
               Orders.add(line);
               newOrders = line.split("\\|");
               line = fileInput.readLine();
                 
               for(String word : newOrders)
               {
                   System.out.println(word);
               }
               
            }
              
            fileInput.close();
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
    public void writeFile() //throws IOException
    {
        try
        {
            PrintWriter writer = new PrintWriter(new BufferedWriter
                                            (new FileWriter
                                            ("/Users/lbevins/Desktop/OrdersProcessed.txt")));
            for(String word : newOrders)
               {
                   writer.println("Order ID: " + newOrders [0] + 
                            "\n Part Num: " + newOrders [1] +
                            "\n Price: " + newOrders [2] +
                            "\n Quantity: " + newOrders [3] +
                            "\n Tax: " +  +
                            "\n Shipping: " + "" +
                           "\n Total: " + "" );
               }
            
            writer.close();
            
        }
        catch(IOException e)
        {
            System.out.println(e);         
        }
    }
    public void calculateResults()
    {
        
    }
    
//    public void display()
//    {
//        
//        for(String order : Orders)
//        {
//            System.out.println(Orders);
//        }
//        
//    }
}
