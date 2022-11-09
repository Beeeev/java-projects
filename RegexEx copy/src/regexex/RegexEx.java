/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regexex;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 *
 * @author lbevins
 */
public class RegexEx {

    /**
     * @param args the command line arguments
     */ 
    
    public static void main(String[] args) {
        Pattern P = Pattern.compile("[(]?([0-9]{3})[)]?[- .]?([0-9]{3})[-.]([0-9]{4})");
        String numbers[] = {"(419)123-4567", "(419) 123-4567", "419-123-4567", 
               "419.123.4567", "419_123_4567", "(419)123-456" , "4191234567", "419123456"};
        checkNumber(P, numbers);
        
    }
    
    public static void checkNumber(Pattern P, String numbers[])
    {
       int a = 0;
      
       for(String i : numbers)
       { 
           Matcher match = P.matcher(numbers[a]);
           System.out.println(numbers[a]);
           if(match.matches())
           {
               String areaCode = match.group(1);
               String section1 = match.group(2);
               String section2 = match.group(3);
               System.out.println("your number is valid");
               
           }
           else
           {
               System.out.println("your number is not valid");
               System.out.println("Reformatting...");
               System.out.println(match.replaceAll("(" + match.group(1) + ")" + " " + match.group(2) + "-" + match.group(3)));
           }
           a++;
       }
    }
}
