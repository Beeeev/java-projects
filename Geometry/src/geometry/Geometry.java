/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometry;

/**
 *
 * @author lbevins
 */
public class Geometry {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Rectangle myRectangle1 = new Rectangle();
       
       myRectangle1.setWidth(3);
       myRectangle1.setHeight(5);
       
       Rectangle myRectangle2 = new Rectangle(6, 4);
       
      myRectangle2.setWidth(3);
       
        System.out.println(myRectangle1.toString());
         System.out.println(myRectangle2);
    }
    
}
