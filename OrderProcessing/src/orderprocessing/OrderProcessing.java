/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orderprocessing;

import java.util.ArrayList;

/**
 *
 * @author lbevins
 */
public class OrderProcessing {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        OrderProcessor myProcessor = new OrderProcessor();
        System.out.println("Start Processing Orders");
        myProcessor.fileRead();
        myProcessor.writeFile();
    }
        
}
