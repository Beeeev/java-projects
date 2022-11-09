/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orderprocessinghelp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
/**
 *
 * @author lbevins
 */


public class OrderProcessor {
    private final String readFile;
    private final String writeFile;
    private final double TAX_RATE = .02;
    private final double SHIPPING_RATE = .05;
    String[] newOrders;
    ArrayList<String> Orders = new ArrayList<>();
    BufferedReader br;
    PrintWriter pw;
    /**
     * default constructor
     */
    public OrderProcessor() {
        this.readFile = "Orders.txt";
        this.writeFile = "OrdersProcessed.txt";  
    }
    /**
     * parameter loaded constructor
     */
    public OrderProcessor(String readFile, String writeFile) {
        this.readFile = readFile;
        this.writeFile = writeFile;
    }
    /**
     * attempts to open the file
     */
    public void openFiles()
    {
        
        try
        {
           BufferedReader br = new BufferedReader(new FileReader(new File(readFile)));
        }
        catch(IOException x)
        {
            System.out.println("File Cannot Open");
        }
    }
    /**
     * attempts to close the files
     */
    public void closeFiles()
    {
        try 
        {
            br.close();
            pw.close();
            System.out.println("Finished processing orders");
        } 
        catch (IOException ex) 
        {
            System.out.println("Couldnt close files");
        }
           
    }
    /**
     * gets rid of the pipes between the records, so they can be used
     */
    public void processOrders()
    {
        System.out.println("Start processing orders");
        try
        {
            this.br = new BufferedReader(new FileReader(new File(readFile)));
            this.pw = new PrintWriter(writeFile);
            String line = br.readLine();
            line = null;
            while((line = br.readLine()) != null)
            {
                Orders.add(line);
                newOrders = line.split("\\|");
                calculateAndWrite(newOrders[0], newOrders[1], Double.parseDouble(newOrders[2]), Integer.parseInt(newOrders[3]));
            }
            
        }
        catch(Exception x)
        {
            System.out.println("Processing failed");
            System.out.println(x);
        }
         
    }
    /**
     * takes each part of the orders text, calculates with tax and shipping amounts. Also writes to the new formatted text file.
     */
    
    public void calculateAndWrite(String orderID, String partNumber, double price, int quantity) throws IOException
    {    
    
        try
        {
            double Total = price * quantity;
            double itemTax = Math.round(Total * TAX_RATE * 100.0) / 100.0;
            double itemShippingRate = Math.round(Total * SHIPPING_RATE * 100.0) / 100.0;
            double finalTotal = Math.round((Total + itemTax + itemShippingRate) * 100.0) / 100.0;
            pw.println("Order ID: " + orderID + "\n" +
                    "Part Num: " + partNumber  + "\n" +
                    "Price: "  + price + "\n" +
                    "Quantity: " + quantity +  "\n" +
                    "Tax: " + itemTax + "\n" +
                    "Shipping: "  + itemShippingRate + "\n" +
                    "Total: " + finalTotal + "\n" +
                    "---------------------------");
            
        }
        catch(Exception x)
        {
             System.out.println("Calculating and writing failed");
             System.out.println(x);
        }
        
    }
}
