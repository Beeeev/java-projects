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

/*
right click to use insert code.. adds constructors etc.
*/
public class Square {

    private double width;
    
    public Square(double width) {
        this.width = width;
    }
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Square{" + "width=" + width + '}';
    }

   
  
    
}
