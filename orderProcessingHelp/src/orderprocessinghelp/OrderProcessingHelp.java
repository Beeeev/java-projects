/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orderprocessinghelp;

/**
 *
 * @author lbevins
 */
public class OrderProcessingHelp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OrderProcessor myProcessor = new OrderProcessor();
        myProcessor.openFiles();
        myProcessor.processOrders();
        myProcessor.closeFiles();
    }
    
}
