package javalibs2;

import java.util.Scanner;

/**
 *
 * @author lbevins
 */
public class Javalibs2 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       
        System.out.println("What is your name?");
            String name = sc.nextLine();
        
        System.out.println("Hello, " + name + ". Lets write a story, start "
        + "with a adjective");
            String adjective1 = sc.nextLine();
        
        System.out.println("Great choice " + name + ", now pick a type of bird");
            String birdtype = sc.nextLine();
                
        System.out.println("Pick a room in a house such as a kitchen etc.");
            String room = sc.nextLine();
        
        System.out.println("Pick a verb");
            String verb1 = sc.nextLine();
        
        System.out.println("Almost there don't give up! Pick a part of "
        + "the body plural");
            String bodyPart = sc.nextLine();
        
        System.out.println("Pick a number");
            int x = sc.nextInt();
            int y = x * 2; 
        
        System.out.println("Pick a number with a decimal");
            double a = sc.nextDouble();
            double b = a / 1.456;  
        
        System.out.println("Lastly, pick a room");
            String room2 = sc.next();
                
        System.out.println("It was a cold November day. I woke up to the \n"
             + adjective1 + " smell of " + birdtype + " roasting in the " + room
             + ".\nI went down stairs to see if I could help " + verb1 + ".\nWhen I got "
             + "there I couldn't believe my " + bodyPart + " \nthere were "
             + x + " legs on the bird. " + "\nWhen I turned away and looked back it had \n"
             + y + " legs! and now the bird is " + b + " inches long!"
             + "\nafter seeing such a sight I proceeded to run to my " + room2 
             + "The End!"); 
       
            sc.close();
        
    }
}

    