
package tip01;

public class Tip01 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        double person1 = 10;
        double person2 = 12;
        double person3 = 9;
        
        double person1Total = calc.findTotal(person1);
        System.out.println(person1Total);
        
        double person2Total = calc.findTotal(person2);
        System.out.println(person2Total);
        
        System.out.println(calc.findTotal(person3));
        
        
        
        
        
        //Find everyone's indivudlal total after tax(5%) and tip(15%)
        
        
        
        
        /*This is what everyone owes before tax and tip:
        Person 1: $10
        Person 2: $12
        Person 3: $9
        Person 4: $8
        Person 5: $7
        Person 6: $15
        Person 7: $11
        Person 8: $30
        */
        
    }    
}
