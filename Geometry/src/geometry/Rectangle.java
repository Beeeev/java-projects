package geometry;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lbevins
 */
public class Rectangle {
    
    private double height;
    private double width;
    private double area;
    private double perimeter;
    
    //public Rectangle()
    {
    
    }
    
    public Rectangle (double height, double width)
    {
    this.height = height;
    this.width = width;
    }
    
    public double getHeight()
    {
    return height;
    }
    
    public void setHeight(double Height)
    {
        this.height = height;
    }
    
    
    public double getWidth()
    {
    return width;
    } 
    
    
    public void setWidth(double Width)
    {
        this.width = width;
    }
    
    public double getArea()
    {
        return width * height;
    }
    
    public double getPerimeter()
    {
        return 2 * width + 2 * height;
    }
    
    @Override
    public String toString()
    {
        return "height: " + getHeight() + "\nWidth: " + getWidth() + 
                "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
    }
    
}
