package testclass;


/**
 *
 * @author lbevins
 */
public class TestClass {

    public static void main(String[] args){
            
       ComputeMethods cM = new ComputeMethods();

       double temp1 = 212.0;
       double temp2 = 32.0;
       int a = 3;
       int b = 4;
      
       System.out.println(temp1 + " degrees is " + cM.fToC(temp1) + " celsius!");
       System.out.println(temp2 + " degrees is " + cM.fToC(temp2) + " celsius!");
       
       System.out.println(cM.hypotenuse(a, b) + " is the hypotenuse");
       
       System.out.println("Your lucky number is " + cM.roll());
       
    }
    
}
